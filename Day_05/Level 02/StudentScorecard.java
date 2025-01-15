import java.util.Random;

public class StudentScorecard {

    public static void main(String[] args) {
        int numberOfStudents = 5;

        // Generate random scores for PCM
        int[][] scores = generateRandomScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] totals = calculateTotals(scores);

        // Calculate grades based on percentages
        String[] grades = calculateGrades(totals);

        // Display the scorecard
        displayScorecard(scores, totals, grades);
    }

    public static int[][] generateRandomScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(51) + 50; // Physics
            scores[i][1] = random.nextInt(51) + 50; // Chemistry
            scores[i][2] = random.nextInt(51) + 50; // Maths
        }

        return scores;
    }

    public static double[][] calculateTotals(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    public static String[] calculateGrades(double[][] totals) {
        String[] grades = new String[totals.length];

        for (int i = 0; i < totals.length; i++) {
            double percentage = totals[i][2];
            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        return grades;   
    }

    public static void displayScorecard(int[][] scores, double[][] totals, String[] grades) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "Physics", "Chemistry", "Maths", "Total", "Avg", "%", "Grade");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf(
                "%-10d%-10d%-10d%-10.0f%-10.2f%-10.2f%-10s%n",
                scores[i][0], scores[i][1], scores[i][2],
                totals[i][0], totals[i][1], totals[i][2], grades[i]
            );
        }
    }
}
