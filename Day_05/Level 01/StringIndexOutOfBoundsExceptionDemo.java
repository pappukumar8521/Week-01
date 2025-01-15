import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        demonstrateExceptionHandling(text);
    }

    public static void generateException(String text) {
        System.out.println(text.charAt(text.length() + 1));
    }

    public static void demonstrateExceptionHandling(String text) {
        try {
            System.out.println(text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
