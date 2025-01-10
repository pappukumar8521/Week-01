import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();  // Taking input for kilometers
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }
}
