import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int tempNumber = Math.abs(number);

        int[] frequency = new int[10];

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            frequency[digit]++;
            tempNumber /= 10;
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
