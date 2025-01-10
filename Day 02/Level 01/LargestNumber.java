import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            int number1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            int number2 = scanner.nextInt();

            System.out.print("Enter the third number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            int number3 = scanner.nextInt();

            boolean isFirstLargest = number1 > number2 && number1 > number3;
            boolean isSecondLargest = number2 > number1 && number2 > number3;
            boolean isThirdLargest = number3 > number1 && number3 > number2;

            System.out.println("Is the first number the largest? " + (isFirstLargest ? "Yes" : "No"));
            System.out.println("Is the second number the largest? " + (isSecondLargest ? "Yes" : "No"));
            System.out.println("Is the third number the largest? " + (isThirdLargest ? "Yes" : "No"));
        }
    }
}



