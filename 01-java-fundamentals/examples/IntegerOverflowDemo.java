public class IntegerOverflowDemo {
    public static void main(String[] args) {
        int maximum = Integer.MAX_VALUE;
        int wrapped = maximum + 1;

        System.out.println(maximum);
        System.out.println(wrapped);

        try {
            System.out.println(Math.addExact(maximum, 1));
        } catch (ArithmeticException exception) {
            System.out.println("Overflow detected");
        }
    }
}
