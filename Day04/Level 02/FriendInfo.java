import java.util.Scanner;

public class FriendInfo {

    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
        String youngestFriend = "Amar";
        if (ages[1] < minAge) {
            minAge = ages[1];
            youngestFriend = "Akbar";
        }
        if (ages[2] < minAge) {
            minAge = ages[2];
            youngestFriend = "Anthony";
        }
        return youngestFriend;
    }

    public static String findTallest(int[] heights) {
        int maxHeight = heights[0];
        String tallestFriend = "Amar";
        if (heights[1] > maxHeight) {
            maxHeight = heights[1];
            tallestFriend = "Akbar";
        }
        if (heights[2] > maxHeight) {
            maxHeight = heights[2];
            tallestFriend = "Anthony";
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[3];
        int[] heights = new int[3];

        System.out.print("Enter age of Amar: ");
        ages[0] = scanner.nextInt();
        System.out.print("Enter height of Amar: ");
        heights[0] = scanner.nextInt();

        System.out.print("Enter age of Akbar: ");
        ages[1] = scanner.nextInt();
        System.out.print("Enter height of Akbar: ");
        heights[1] = scanner.nextInt();

        System.out.print("Enter age of Anthony: ");
        ages[2] = scanner.nextInt();
        System.out.print("Enter height of Anthony: ");
        heights[2] = scanner.nextInt();

        String youngestFriend = findYoungest(ages);
        String tallestFriend = findTallest(heights);

        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        scanner.close();
    }
}
