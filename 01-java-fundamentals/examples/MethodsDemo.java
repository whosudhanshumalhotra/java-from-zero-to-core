public class MethodsDemo {
    public static int add(int first, int second) {
        return first + second;
    }

    public static void greet(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    public static void main(String[] args) {
        int result = add(12, 8);
        System.out.println("Sum: " + result);
        greet("Java learner");
    }
}
