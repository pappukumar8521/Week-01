import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    public static String[] findCharacterFrequencies(String text) {
        char[] characters = text.toCharArray();
        int[] frequencies = new int[characters.length];

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                frequencies[i] = 1;

                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequencies[i]++;
                        characters[j] = '0';
                    }
                }
            }
        }

        int uniqueCount = 0;
        for (char c : characters) {
            if (c != '0') {
                uniqueCount++;
            }
        }

        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + ": " + frequencies[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] frequencies = findCharacterFrequencies(input);

        System.out.println("Character frequencies:");
        for (String frequency : frequencies) {
            System.out.println(frequency);
        }

        scanner.close();
    }
}
