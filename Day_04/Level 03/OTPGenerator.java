import java.util.HashSet;

public class OTPGenerator {

    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    public static boolean validateUniqueOTPs(int[] otps) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            uniqueOTPs.add(otp);
        }
        return uniqueOTPs.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }

        boolean areUnique = validateUniqueOTPs(otps);
        System.out.println("Are all OTPs unique? " + areUnique);
    }
}
