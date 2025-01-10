import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter the years of service: ");
        int yearsOfService = scanner.nextInt();
        
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No Bonus for employees with less than or equal to 5 years of service.");
        }
        
        scanner.close();
    }
}
