import java.util.Random;
public class EmployeeBonusCalculator {
    public static double[][] calculateSalaryAndYears() {
        Random random = new Random();
        double[][] employeeData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            employeeData[i][0] = 30000 + random.nextInt(20001); // Salary between 30,000 and 50,000
            employeeData[i][1] = random.nextInt(11); // Years of service between 0 and 10
        }
        return employeeData;
    }
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] newData = new double[10][2];

        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            newData[i][0] = salary + bonus; // New salary
            newData[i][1] = bonus; // Bonus amount
        }
        return newData;
    }
    public static void displaySummary(double[][] employeeData, double[][] newData) {
        double oldSalarySum = 0, newSalarySum = 0, totalBonus = 0;

        System.out.println("Emp# | Old Salary | Years of Service | Bonus Amount | New Salary");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double newSalary = newData[i][0];
            double bonus = newData[i][1];

            oldSalarySum += oldSalary;
            newSalarySum += newSalary;
            totalBonus += bonus;

            System.out.printf("%4d | %10.2f | %16.0f | %12.2f | %10.2f%n",
                    i + 1, oldSalary, yearsOfService, bonus, newSalary);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Total | %10.2f |                 | %12.2f | %10.2f%n",
                oldSalarySum, totalBonus, newSalarySum);
    }
    public static void main(String[] args) {
        double[][] employeeData = calculateSalaryAndYears();
        double[][] newData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, newData);
    }
}
