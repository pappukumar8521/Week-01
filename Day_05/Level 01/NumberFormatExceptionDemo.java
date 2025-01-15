import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        demonstrateExceptionHandling(text);
    }

    public static void generateException(String text) {
        Integer.parseInt(text); // Will throw NumberFormatException if the input isn't a valid integer
    }

    public static void demonstrateExceptionHandling(String text) {
        try {
            Integer.parseInt(text); // Will throw NumberFormatException if the input isn't a valid integer
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }
    }
}
