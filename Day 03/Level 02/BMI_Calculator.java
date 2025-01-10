import java.util.Scanner;

public class BMI_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.0) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nBMI Report:");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Person | Weight (kg) | Height (m) | BMI     | Status");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-7d | %-12.2f | %-11.2f | %-7.2f | %-15s\n", 
                              (i + 1), weight[i], height[i], bmi[i], weightStatus[i]);
        }
    }
}
