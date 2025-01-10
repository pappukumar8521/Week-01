import java.util.Scanner;

public class FactorsAnd2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.println("Factors of " + num + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        int rows = 3, columns = 3;
        int[][] twoDArray = new int[rows][columns];
        int[] oneDArray = new int[rows * columns];
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoDArray[i][j] = i * columns + j + 1;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneDArray[count++] = twoDArray[i][j];
            }
        }
        System.out.println("1D array from 2D array:");
        for (int i : oneDArray) {
            System.out.print(i + " ");
        }
    }
}

