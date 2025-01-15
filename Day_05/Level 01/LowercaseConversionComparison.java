import java.util.Scanner;

public class LowercaseConversionComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String customLowerCase = convertToLowerCase(text);
        String builtInLowerCase = text.toLowerCase();

        boolean comparisonResult = compareStrings(customLowerCase, builtInLowerCase);
        System.out.println(comparisonResult);
    }

    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                currentChar += 32;
            }
            result.append(currentChar);
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
}
