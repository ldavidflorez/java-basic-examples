import java.util.Scanner;

public class ClassExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side len one: ");
        double a = scanner.nextInt();

        System.out.println("Enter side len two: ");
        double b = scanner.nextInt();

        System.out.println("Enter side len three: ");
        double c = scanner.nextInt();

        Triangle triangle = new Triangle(a, b, c);

        System.out.println("\nValid triangle: " + triangle.isValid());
        System.out.println("Triangle type: " + triangle.triangleType());
        System.out.println("Triangle perimeter: " + triangle.findPerimeter());
        System.out.println("Triangle area: " + triangle.findArea());

        scanner.close();
    }
}
