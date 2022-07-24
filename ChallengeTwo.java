import java.util.Scanner;

public class ChallengeTwo {

    public static double computeSalary(int hoursPerWeek, double moneyPerHour, boolean hasVacation) {
        double salary;

        if (hasVacation) {
            salary = 50 * hoursPerWeek * moneyPerHour + 1000;
        } else {
            salary = 50 * hoursPerWeek * moneyPerHour;
        }

        return salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hours per week: ");
        int hoursPerWeek = scanner.nextInt();

        System.out.println("Enter money per hour: ");
        double moneyPerHour = scanner.nextDouble();

        System.out.println("Vacation?");
        boolean hasVacation = scanner.nextBoolean();

        double salary = computeSalary(hoursPerWeek, moneyPerHour, hasVacation);

        System.out.println("The year's salary is: " + salary);

        scanner.close();
    }
}
