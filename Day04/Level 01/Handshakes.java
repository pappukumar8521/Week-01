import java.util.Scanner;

public class Handshakes {
    public static int NumberHandshakes(int Student) {
        return (Student * (Student - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int Student = sc.nextInt();

        int Handshakes = NumberHandshakes(Student);
        System.out.println("The number of handshakes possible is: " + Handshakes);
    }
}
