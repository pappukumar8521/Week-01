import java.util.*;
public class DivisibleByFive {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enetr the Number ");
        int Number=sc.nextInt();
        if(Number%5==0){
            System.out.println("Is the number " + Number + " divisible by 5? Yes");
        }
        else{
            System.out.println("Is the number " + Number + " divisible by 5? No");

        }
    }
}