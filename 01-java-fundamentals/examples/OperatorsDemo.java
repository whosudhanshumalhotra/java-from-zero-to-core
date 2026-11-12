public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Integer division: " + (a / b));
        System.out.println("Remainder: " + (a % b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Both positive? " + (a > 0 && b > 0));
        System.out.println("Larger value: " + (a > b ? a : b));
    }
}
