import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discountPrecent = sc.nextInt();
        int c = sc.nextInt();

        int result1 = fee + discountPrecent * c;
        int result2 = fee * discountPrecent + c;
        int result3 = c + fee / discountPrecent;
        int result4 = fee % discountPrecent + c;

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3 + ", " + result4);
    }
}

