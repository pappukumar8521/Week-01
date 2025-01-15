import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status for a person
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // Convert height to meters
        double bmi = weight / (heightM * heightM); // BMI formula
        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.format("%.2f", bmi), status};
    }

    // Method to process input data and compute BMI and status for all persons
    public static String[][] processBMI(double[][] heightWeightArray) {
        String[][] resultArray = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = heightWeightArray[i][0];
            double height = heightWeightArray[i][1];
            String[] bmiData = calculateBMI(weight, height);

            resultArray[i][0] = String.format("%.2f", weight);
            resultArray[i][1] = String.format("%.2f", height);
            resultArray[i][2] = bmiData[0];
            resultArray[i][3] = bmiData[1];
        }

        return resultArray;
    }

    // Method to display the result in a tabular format
    public static void displayResult(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");

        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] heightWeightArray = new double[10][2];

        System.out.println("Enter the weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d:\n", i + 1);
            System.out.print("Weight (kg): ");
            heightWeightArray[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            heightWeightArray[i][1] = scanner.nextDouble();
        }

        // Process BMI data
        String[][] bmiData = processBMI(heightWeightArray);

        // Display the results
        displayResult(bmiData);

        scanner.close();
    }
}
