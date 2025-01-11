import java.util.Scanner;

public class BMI_Calculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInMeters = heightInCm / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi;  // Store BMI in the third column
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] data = new double[10][3]; // 10 persons, 3 columns (weight, height, bmi)

        // Take input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Determine BMI status
        String[] statuses = determineBMIStatus(data);

        // Display results
        System.out.println("\nPerson | Weight (kg) | Height (cm) | BMI  | Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d | %11.2f | %12.2f | %.2f | %s%n", 
                i + 1, data[i][0], data[i][1], data[i][2], statuses[i]);
        }

        scanner.close();
    }
}
