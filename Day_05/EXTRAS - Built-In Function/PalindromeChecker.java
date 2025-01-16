import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        String input = getInput();
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    public static boolean checkPalindrome(String input) {
        String sanitized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = sanitized.length() - 1;
        while (left < right) {
            if (sanitized.charAt(left) != sanitized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(String input, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}
