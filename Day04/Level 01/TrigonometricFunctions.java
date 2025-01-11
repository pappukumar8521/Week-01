import java.util.Scanner;

public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double[] results = new double[3];
        double radians = Math.toRadians(angle);        
        results[0] = Math.sin(radians);  // Sine
        results[1] = Math.cos(radians);  // Cosine
        results[2] = Math.tan(radians);  // Tangent
        return results;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println("Sine of " + angle + " degrees: " + results[0]);
        System.out.println("Cosine of " + angle + " degrees: " + results[1]);
        System.out.println("Tangent of " + angle + " degrees: " + results[2]);
    }
}
