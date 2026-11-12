#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
EXAMPLES_DIR="$ROOT_DIR/01-java-fundamentals/examples"
EXPECTED_DIR="$ROOT_DIR/scripts/expected-output"
BUILD_DIR="$(mktemp -d)"
ACTUAL_FILE="$BUILD_DIR/actual.txt"
trap 'rm -rf "$BUILD_DIR"' EXIT

if ! command -v javac >/dev/null 2>&1; then
    echo "ERROR: javac was not found. Install JDK 21 and ensure it is on PATH." >&2
    exit 1
fi
if ! command -v diff >/dev/null 2>&1; then
    echo "ERROR: diff was not found; install standard diff utilities." >&2
    exit 1
fi

JAVA_VERSION_OUTPUT="$(javac -version 2>&1)"
echo "Compiler: $JAVA_VERSION_OUTPUT"
if [[ ! "$JAVA_VERSION_OUTPUT" =~ 21 ]]; then
    echo "ERROR: This repository's examples are verified against JDK 21; found $JAVA_VERSION_OUTPUT" >&2
    exit 1
fi

JAVA_FILES=()
while IFS= read -r java_file; do
    JAVA_FILES+=("$java_file")
done < <(find "$EXAMPLES_DIR" -maxdepth 1 -type f -name '*.java' | sort)

if [[ ${#JAVA_FILES[@]} -eq 0 ]]; then
    echo "ERROR: No Java examples found in $EXAMPLES_DIR" >&2
    exit 1
fi

echo "Compiling ${#JAVA_FILES[@]} Java example files..."
javac --release 21 -d "$BUILD_DIR" "${JAVA_FILES[@]}"
echo "Compilation passed."

SMOKE_TESTS=(
    "HelloWorld"
    "VariablesDemo"
    "TypeCastingDemo"
    "OperatorsDemo"
    "ConditionsDemo"
    "LoopsDemo"
    "MethodsDemo"
    "MethodOverloadingDemo"
    "PassByValueDemo"
    "RecursionDemo"
    "ShortCircuitDemo"
    "IntegerOverflowDemo"
)

for class_name in "${SMOKE_TESTS[@]}"; do
    echo "Checking output: $class_name"
    java -cp "$BUILD_DIR" "$class_name" > "$ACTUAL_FILE"
    diff -u "$EXPECTED_DIR/$class_name.txt" "$ACTUAL_FILE"
done

echo "Checking output: UserInputDemo"
printf 'Alex\n21\n' | java -cp "$BUILD_DIR" UserInputDemo > "$ACTUAL_FILE"
diff -u "$EXPECTED_DIR/UserInputDemo.txt" "$ACTUAL_FILE"

echo "PASS: all Java examples compile and match their expected output."
