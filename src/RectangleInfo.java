import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width, height;

        do {
            System.out.print("Enter the width of the rectangle: ");
            while (!scanner.hasNextDouble() || (width = scanner.nextDouble()) <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
                scanner.nextLine();
            }
        } while (width <= 0);

        do {
            System.out.print("Enter the height of the rectangle: ");
            while (!scanner.hasNextDouble() || (height = scanner.nextDouble()) <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
                scanner.nextLine();
            }
        } while (height <= 0);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Diagonal: %.2f\n", diagonal);
        scanner.close();
    }
}
