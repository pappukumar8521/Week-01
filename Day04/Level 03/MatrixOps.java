import java.util.Random;

public class MatrixOps {
    public static double[][] createMatrix(int r, int c) {
        double[][] m = new double[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) m[i][j] = new Random().nextInt(10);
        return m;
    }

    public static double[][] add(double[][] a, double[][] b) {
        double[][] r = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) for (int j = 0; j < a[0].length; j++) r[i][j] = a[i][j] + b[i][j];
        return r;
    }

    public static double[][] sub(double[][] a, double[][] b) {
        double[][] r = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) for (int j = 0; j < a[0].length; j++) r[i][j] = a[i][j] - b[i][j];
        return r;
    }

    public static double[][] transpose(double[][] m) {
        double[][] t = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) for (int j = 0; j < m[0].length; j++) t[j][i] = m[i][j];
        return t;
    }

    public static double det2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static double[][] inv2x2(double[][] m) {
        double d = det2x2(m);
        if (d == 0) throw new IllegalArgumentException("Singular matrix.");
        return new double[][]{{m[1][1] / d, -m[0][1] / d}, {-m[1][0] / d, m[0][0] / d}};
    }

    public static void show(double[][] m) {
        for (double[] r : m) {
            for (double v : r) System.out.printf("%8.2f", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] a = createMatrix(2, 2), b = createMatrix(2, 2);
        System.out.println("Matrix A:"); show(a);
        System.out.println("Matrix B:"); show(b);
        System.out.println("A + B:"); show(add(a, b));
        System.out.println("A - B:"); show(sub(a, b));
        System.out.println("Det(A): " + det2x2(a));
        System.out.println("Inverse(A):"); show(inv2x2(a));
        System.out.println("Transpose(A):"); show(transpose(a));
    }
}
