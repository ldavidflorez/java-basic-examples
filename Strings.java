import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string example: ");
        String str = scanner.nextLine();
        System.out.println("The last char is: " + str.toUpperCase().charAt(str.length()-1));

        scanner.close();
    }
}
