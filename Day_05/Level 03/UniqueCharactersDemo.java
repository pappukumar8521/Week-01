import java.util.Scanner;

public class UniqueCharactersDemo {

    public static int findLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        return count;
    }

    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(input);

        System.out.print("Unique characters in the string: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
