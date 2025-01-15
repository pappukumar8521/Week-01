import java.util.Scanner;

public class CharacterFrequency {

    public static char[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        char[][] result = new char[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] > 0) {
                result[index][0] = text.charAt(i);
                result[index][1] = (char) (frequency[text.charAt(i)] + '0');
                frequency[text.charAt(i)] = 0;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[][] frequencies = findCharacterFrequencies(input);

        System.out.println("Character frequencies:");
        for (char[] pair : frequencies) {
            System.out.println(pair[0] + ": " + (int) pair[1]);
        }

        scanner.close();
    }
}
