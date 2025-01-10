
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = scanner.nextInt();
        int totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 3.0);
        System.out.println("Average Marks: " + percentage + "%");
        if (percentage >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remark: Excellent Performance");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remark: Good Performance");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remark: Satisfactory Performance");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remark: Needs Improvement");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
            System.out.println("Remark: Poor Performance");
        } else {
            System.out.println("Grade: Remedial Standard");
            System.out.println("Remark: Requires Significant Improvement");
        }
        scanner.close();
    }
}
