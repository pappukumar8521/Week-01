import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        double[] heights = new double[11];
        double sum = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("The mean height of the football team is: " + mean);

        scanner.close();
    }
}

