import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] result = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < index; j++) {
                if (result[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result[index++] = currentChar;
            }
        }

        char[] uniqueChars = new char[index];
        System.arraycopy(result, 0, uniqueChars, 0, index);
        return uniqueChars;
    }

    public static String[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] uniqueCharacters = findUniqueCharacters(text);
        String[][] result = new String[uniqueCharacters.length][2];

        for (int i = 0; i < uniqueCharacters.length; i++) {
            result[i][0] = String.valueOf(uniqueCharacters[i]);
            result[i][1] = String.valueOf(frequency[uniqueCharacters[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencies = findCharacterFrequencies(input);

        System.out.println("Character frequencies:");
        for (String[] pair : frequencies) {
            System.out.println(pair[0] + ": " + pair[1]);
        }

        scanner.close();
    }
}
