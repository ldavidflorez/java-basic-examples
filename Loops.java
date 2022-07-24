import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            System.out.println("Repeating...");

            System.out.println("Next?");
            boolean next = scanner.nextBoolean();
            if (next) {
                repeat = false;
            }
        }

        System.out.println("Next");

        scanner.close();

    }
}
