import java.util.Random;

public class VotingEligibility {

    public static void main(String[] args) {
        int numberOfStudents = 10;

        // Generate random ages for students
        int[] ages = generateRandomAges(numberOfStudents);

        // Check voting eligibility
        String[][] votingEligibility = checkVotingEligibility(ages);

        // Display the result in a tabular format
        displayTable(votingEligibility, "Age", "Can Vote");
    }

    public static int[] generateRandomAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(90) - 10; // Random age between -10 and 80
        }

        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) {
                result[i][1] = "True";
            } else {
                result[i][1] = "False";
            }
        }

        return result;
    }

    public static void displayTable(String[][] data, String col1, String col2) {
        System.out.printf("%-10s%-10s%n", col1, col2);
        System.out.println("-------------------");
        for (String[] row : data) {
            System.out.printf("%-10s%-10s%n", row[0], row[1]);
        }
    }
}
