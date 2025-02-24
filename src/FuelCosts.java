import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons, mpg, pricePerGallon;

        do {
            System.out.print("Enter gallons of gas in the tank: ");
            while (!scanner.hasNextDouble() || (gallons = scanner.nextDouble()) <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
                scanner.nextLine(); // Clear invalid input
            }
        } while (gallons <= 0);

        do {
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            while (!scanner.hasNextDouble() || (mpg = scanner.nextDouble()) <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
                scanner.nextLine();
            }
        } while (mpg <= 0);

        do {
            System.out.print("Enter price of gas per gallon: ");
            while (!scanner.hasNextDouble() || (pricePerGallon = scanner.nextDouble()) <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
                scanner.nextLine();
            }
        } while (pricePerGallon <= 0);

        double costPer100Miles = (100 / mpg) * pricePerGallon;
        double maxDistance = gallons * mpg;

        System.out.printf("Cost to drive 100 miles: $%.2f\n", costPer100Miles);
        System.out.printf("The car can travel: %.2f miles\n", maxDistance);
        scanner.close();
    }
}
