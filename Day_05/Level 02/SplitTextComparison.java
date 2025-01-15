import java.util.Scanner;

public class SplitTextComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] customSplitWords = splitTextWithoutSplitMethod(text);
        String[] builtInSplitWords = text.split(" ");

        boolean comparisonResult = compareStringArrays(customSplitWords, builtInSplitWords);

        System.out.println("Custom Split Words: ");
        for (String word : customSplitWords) {
            System.out.println(word);
        }
        System.out.println("Are the results the same? " + comparisonResult);
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
       
