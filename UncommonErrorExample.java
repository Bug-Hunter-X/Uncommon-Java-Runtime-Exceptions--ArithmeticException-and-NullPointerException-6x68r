public class UncommonErrorExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("This will always execute.");
        }
        String str = null;
        System.out.println(str.length()); //Potential NullPointerException

    }
}