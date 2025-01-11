import java.util.Scanner;

public class SmallestAndLargest {

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2];
        result[0] = Math.min(Math.min(number1, number2), number3); // Smallest
        result[1] = Math.max(Math.max(number1, number2), number3); // Largest
        return result;   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = sc.nextInt();  
        System.out.println("Enter the third number: ");
        int number3 = sc.nextInt();
        int[] result = findSmallestAndLargest(number1, number2, number3);
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
    }
}
