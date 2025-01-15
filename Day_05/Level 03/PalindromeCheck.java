import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    public static boolean isPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reversed = new char[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = text.charAt(length - i - 1);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean resultLogic1 = isPalindromeLogic1(input);
        boolean resultLogic2 = isPalindromeLogic2(input, 0, input.length() - 1);
        boolean resultLogic3 = isPalindromeLogic3(input);

        System.out.println("Using Logic 1 (start and end comparison): " + (resultLogic1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Logic 2 (recursion): " + (resultLogic2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Logic 3 (character arrays): " + (resultLogic3 ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }
}
