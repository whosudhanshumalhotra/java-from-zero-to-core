# Repository Release Checklist

This checklist distinguishes what is verified in this package from what the repository owner must do on GitHub.

## Completed in this package

- [x] Root README navigation and status language reviewed.
- [x] Module 01 expanded with scope, overflow, short-circuiting, overloading, pass-by-value and recursion.
- [x] Added executable examples for overloading, pass-by-value, recursion, short-circuit evaluation and integer overflow.
- [x] Practice tasks expanded and grouped by difficulty.
- [x] Interview preparation expanded with follow-ups and a mini mock interview.
- [x] Added `.editorconfig` and `.gitattributes`.
- [x] Added a Java 21 GitHub Actions workflow.
- [x] Added a local verification script that compiles examples and compares actual output against expected-output fixtures.
- [x] Added pull-request and issue templates.
- [x] Existing Java examples retained.

## Verified locally for this package

- [x] Run `bash scripts/verify-examples.sh` using JDK 21; compilation and all expected-output comparisons passed in this packaging session.
- [ ] Confirm the GitHub Actions workflow passes after pushing.
- [ ] Review the repository on GitHub after upload.

## Required owner decisions/actions

- [ ] Choose a license before adding a `LICENSE` file. Until then, reuse and redistribution permissions are not granted by an assumed open-source license.
- [ ] Confirm the repository's default branch is `main` or `master`, or adjust the workflow branch filter.
- [ ] Push the changes and verify GitHub Actions.
- [ ] Add the remaining module lessons; roadmap pages are not complete course content.
- [ ] Add automated tests and project-specific build files when projects are introduced.
- [ ] Review all content and external links periodically as Java and tooling evolve.

## Release status

This package is a stronger **educational repository release candidate**. It is not a completed Java course, and it is not a production application. Do not advertise all modules as complete until the lesson, code, exercise and interview content has been authored and verified.
