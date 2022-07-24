import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 5) {
            System.out.println("The number is less or equal than 5");
            
        } else {
            System.out.println("The number isn´t less than five");
        }

        scanner.close();
    }
}
