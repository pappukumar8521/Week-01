import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        double[][] marks = new double[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                double mark;
                do {
                    if (j == 0) System.out.print("Enter marks for Physics (0-100) for student " + (i + 1) + ": ");
                    else if (j == 1) System.out.print("Enter marks for Chemistry (0-100) for student " + (i + 1) + ": ");
                    else System.out.print("Enter marks for Maths (0-100) for student " + (i + 1) + ": ");
                    mark = sc.nextDouble();
                    if (mark < 0 || mark > 100) {
                        System.out.println("Marks must be between 0 and 100. Please enter again.");
                    }
                } while (mark < 0 || mark > 100);
                marks[i][j] = mark;
            }

            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 75) {
                grades[i] = "B";
            } else if (percentages[i] >= 50) {
                grades[i] = "C";
            } else {
                grades[i] = "D";
            }
        }

        System.out.println("\nStudent Report:");
        System.out.println("----------------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-8d | %-7.2f | %-9.2f | %-5.2f | %-10.2f | %-5s\n", 
                              (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}
