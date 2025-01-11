import java.util.Scanner;

public class NumberChecker {

    public static String isPositive(int num) {
        if (num < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    public static String isEven(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": " + numbers[i]);
            String positivity = isPositive(numbers[i]);
            System.out.println(" - " + positivity);

            if (positivity.equals("Positive")) {
                String evenOdd = isEven(numbers[i]);
                System.out.println("It is " + evenOdd);
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("First number is greater than the last.");
        } else if (result == 0) {
            System.out.println("First number is equal to the last.");
        } else {
            System.out.println("First number is less than the last.");
        }

        scanner.close();
    }
}
