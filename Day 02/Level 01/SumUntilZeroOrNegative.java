import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double number;

        // Infinite while loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            number = scanner.nextDouble();

            if (number <= 0) {
                break;  // Exit the loop if user enters 0 or a negative number
            }

            total += number;  // Add the entered number to the total
        }

        // Output the final sum
        System.out.println("The total sum is: " + total);
        scanner.close();  // Close the scanner
    }
}

