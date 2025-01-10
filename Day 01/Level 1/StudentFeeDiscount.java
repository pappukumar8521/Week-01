import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Declare variables for the fee, discount percent, and discount
        double fee, discountPercent, discount, finalFee;
        
        // Ask the user to enter the fee
        System.out.print("Enter the student's fee: ");
        fee = input.nextDouble();        
        System.out.print("Enter the university discount percent: ");
        discountPercent = input.nextDouble();
        discount = (fee * discountPercent) / 100;
        finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and the final discounted fee is INR " + finalFee);
        input.close();
    }
}

