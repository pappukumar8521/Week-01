import java.util.Scanner;

public class CharacterTypeFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String[][] resultArray = classifyCharacters(text);
        display2DArray(resultArray);
    }

    public static String classifyCharacter(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            char lowerCaseChar = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
            if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] classifyCharacters(String text) {
        int length = calculateStringLength(text);
        String[][] charInfo = new String[length][2];

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            charInfo[i][0] = String.valueOf(currentChar);
            charInfo[i][1] = classifyCharacter(currentChar);
        }
        return charInfo;
    }

    public static int calculateStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void display2DArray(String[][] array) {
        System.out.printf("%-10s%-15s%n", "Character", "Type");
        System.out.println("--------------------------");
        for (String[] row : array) {
            System.out.printf("%-10s%-15s%n", row[0], row[1]);
        }
    }
}
