import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        int number = getInput();
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }

    public static long calculateFactorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }

    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is " + factorial + ".");
    }
}
