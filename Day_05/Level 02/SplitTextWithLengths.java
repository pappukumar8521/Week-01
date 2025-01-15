import java.util.Scanner;

public class SplitTextWithLengths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String[] words = splitTextWithoutSplitMethod(text);
        String[][] wordsWithLengths = generateWordsWithLengths(words);

        System.out.println("\nWord\tLength");
        for (String[] row : wordsWithLengths) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }

    public static String[] splitTextWithoutSplitMethod(String text) {
        int length = findStringLength(text);
        int wordCount = countWords(text);

        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0, wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[wordIndex++] = i;
            }
        }
        spaceIndexes[wordIndex] = length;

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = spaceIndexes[i];
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
            start = end + 1;
        }
        return words;
    }

    public static int findStringLength(String text) {
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

    public static int countWords(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static String[][] generateWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return result;
    }
}
