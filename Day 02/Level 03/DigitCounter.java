import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int count = 0;
        number = Math.abs(number);
        do {
            number /= 10; 
            count++;      
        } while (number != 0);
        System.out.println("The number of digits is: " + count);
        scanner.close();
    }
}
