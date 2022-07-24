import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        int studentAge = 15;
        double studentGPA = 3.5;
        char studentFirstInitial = 'L';
        char studentLastInitial = 'F';
        boolean isPerfect = false;

        System.out.println("The name of student is: " + name + "\n");

        System.out.println("The student age is: " + studentAge);
        System.out.println("The student GPA is: " + studentGPA);
        System.out.println("The student first initial is: " + studentFirstInitial);
        System.out.println("The student last initial is: " + studentLastInitial);
        System.out.println("The student is perfect: " + isPerfect);
        
        scanner.close();
    }
}
