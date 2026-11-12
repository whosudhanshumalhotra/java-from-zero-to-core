public class TypeCastingDemo {
    public static void main(String[] args) {
        int wholeNumber = 25;
        double widened = wholeNumber;

        double decimalNumber = 19.87;
        int narrowed = (int) decimalNumber;

        System.out.println("Widened value: " + widened);
        System.out.println("Narrowed value: " + narrowed);
    }
}
