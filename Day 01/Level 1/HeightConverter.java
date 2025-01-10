import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        double heightCm, heightInches, heightFeet;
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();
        heightInches = heightCm / 2.54;
        heightFeet = (int)(heightInches / 12);  // Calculate the number of full feet
        heightInches = heightInches % 12;       // Get the remaining inches after converting to feet
        System.out.println("Your height in cm is " + heightCm + " while in feet is " + (int)heightFeet + " and inches is " + (int)heightInches);
        input.close();
    }
}
