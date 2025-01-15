import java.util.Scanner;

public class TrimString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text with leading and trailing spaces: ");
        String text = scanner.nextLine();

        int[] trimIndices = findTrimIndices(text);
        String trimmedTextCustom = createSubstring(text, trimIndices[0], trimIndices[1]);
        String trimmedTextBuiltIn = text.trim();

        System.out.println("Trimmed Text (Custom): '" + trimmedTextCustom + "'");
        System.out.println("Trimmed Text (Built-in): '" + trimmedTextBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + compareStrings(trimmedTextCustom, trimmedTextBuiltIn));
    }

    public static int[] findTrimIndices(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
