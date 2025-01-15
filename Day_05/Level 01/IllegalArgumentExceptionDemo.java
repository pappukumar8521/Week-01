import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        demonstrateExceptionHandling(text);
    }
    public static void generateException(String text) {
        System.out.println(text.substring(5, 3)); // start index > end index
    }
    public static void demonstrateExceptionHandling(String text) {
        try {
            System.out.println(text.substring(5, 3)); // start index > end index
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }
    }
}
