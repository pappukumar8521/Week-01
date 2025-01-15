
import java.util.Scanner;

public class CharacterArrayComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        char[] customArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();
        boolean comparisonResult = compareCharArrays(customArray, builtInArray);
        System.out.println(comparisonResult);
    }

    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }
}



