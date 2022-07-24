import java.util.Scanner;

public class Functions {
    // public static void isOne() {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.println("Enter a number: ");
    //     int number = scanner.nextInt();

    //     while (number != 1) {
    //         System.out.println("It is not 1");
    //         number = scanner.nextInt();
    //     }

    //     System.out.println("It is 1");

    //     scanner.close();
    // }

    public static double operateNumbers(int a, int b) {
        double result = Math.pow(a, b) + Math.exp(a);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        double r = operateNumbers(a, b);
        System.out.println("The result of operation is: " + r);

        scanner.close();
    }
}
