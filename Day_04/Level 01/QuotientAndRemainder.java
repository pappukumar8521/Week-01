
import java.util.*;
public class QuotientAndRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int result[]=new int[2];
        result[0]=number/divisor;
        result[1]=number%divisor;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=sc.nextInt(); 
        System.out.println("Enter the Divisor");
        int divisor=sc.nextInt();
        int result []=findRemainderAndQuotient(number, divisor);
        System.out.println("The number is "  + result[0]) ;
        System.out.println("The divisor is  " + result[1]);
    }
}
