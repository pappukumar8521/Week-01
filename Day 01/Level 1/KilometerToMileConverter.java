import java.util.Scanner;

public class KilometerToMileConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        double km;
        // Ask the user to enter the distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile(s) for the given " + km + " km.");
        input.close();
    }
}
