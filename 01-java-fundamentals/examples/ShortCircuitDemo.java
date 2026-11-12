public class ShortCircuitDemo {
    public static void main(String[] args) {
        String name = null;

        boolean hasUsableName = name != null && !name.isBlank();
        System.out.println(hasUsableName);

        int number = 0;
        boolean safeResult = number != 0 && 10 / number > 1;
        System.out.println(safeResult);
    }
}
