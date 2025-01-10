import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your from city: ");
        String fromCity = scanner.nextLine();
        
        System.out.print("Enter your via city: ");
        String viaCity = scanner.nextLine();
        
        System.out.print("Enter your to city: ");
        String toCity = scanner.nextLine();
        
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();
        
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();
        
        System.out.print("Enter the time taken (in hours): ");
        double timeTaken = scanner.nextDouble();
        
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;
        
        System.out.println("The journey details are as follows:");
        System.out.println("Name: " + name);
        System.out.println("From City: " + fromCity);
        System.out.println("Via City: " + viaCity);
        System.out.println("To City: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Time Taken: " + timeTaken + " hours");
        System.out.println("Average Speed: " + averageSpeed + " miles per hour");
        
        scanner.close();
    }
}

