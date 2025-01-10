import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start number for the countdown: ");
        int start = scanner.nextInt();

        for (int i = start; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
