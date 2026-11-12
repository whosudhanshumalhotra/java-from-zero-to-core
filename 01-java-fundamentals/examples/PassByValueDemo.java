public class PassByValueDemo {
    static void changeNumber(int number) {
        number = 99;
    }

    static void changeFirstElement(int[] numbers) {
        numbers[0] = 99;
    }

    static void reassignArray(int[] numbers) {
        numbers = new int[] {7, 8, 9};
    }

    public static void main(String[] args) {
        int value = 10;
        changeNumber(value);
        System.out.println(value);

        int[] values = {1, 2, 3};
        changeFirstElement(values);
        System.out.println(values[0]);

        reassignArray(values);
        System.out.println(values[0]);
    }
}
