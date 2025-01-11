import java.util.Scanner;

public class NaturalNumberSum {

    public static int sumRecursively(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursively(n - 1);
        }
    }
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return;
        }
        int sumRecursive = sumRecursively(n);
        int sumFormula = sumUsingFormula(n);
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);
        if (sumRecursive == sumFormula) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("The computations do not match.");
        }
    }
}
