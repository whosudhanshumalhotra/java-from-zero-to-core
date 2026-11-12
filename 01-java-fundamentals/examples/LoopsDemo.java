public class LoopsDemo {
    public static void main(String[] args) {
        System.out.println("for loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        System.out.println("while loop:");
        int count = 1;
        while (count <= 3) {
            System.out.println(count);
            count++;
        }

        System.out.println("do-while loop:");
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= 3);
    }
}
