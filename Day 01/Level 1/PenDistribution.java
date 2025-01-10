public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;
        
        // Find how many pens each student gets
        int pensPerStudent = totalPens / students;
        
        // Find the remaining pens
        int remainingPens = totalPens % students;
        
        // Print the result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
