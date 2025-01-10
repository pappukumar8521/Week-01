import java.util.Scanner;

public class HandshakesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numberOfStudents;
        
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();
        
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        System.out.println("The maximum number of handshakes is " + handshakes);
        
        input.close();
    }
}

