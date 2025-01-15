public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        demonstrateExceptionHandling();
    }

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void demonstrateExceptionHandling() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }
}
