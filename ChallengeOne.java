import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String question = "What is the color?";
        String choiceOne = "yellow";
        String choiceTwo = "blue";
        String choiceThree = "red";

        String correctAnswer = choiceTwo;

        System.out.println(question + "\n");
        System.out.println("1. " + choiceOne + "\n" + "2. " + choiceTwo + "\n" + "3. " + choiceThree + "\n");

        String userAnswer = scanner.next();

        while (!userAnswer.equals(correctAnswer)) {
            System.out.println("\nIt is not the correct answer, idiot. Please give me a new answer:");
            userAnswer = scanner.next();
        }

        System.out.println("\nCongratulations, it is the correct answer!");

        scanner.close();

    }
}
