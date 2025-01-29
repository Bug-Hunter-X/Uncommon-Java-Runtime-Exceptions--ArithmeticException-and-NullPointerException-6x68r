public class UncommonErrorSolution {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            if (b == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                int result = a / b;
                System.out.println(result);
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
        String str = null;
        if (str != null) {
            System.out.println(str.length());
        } else {
            System.out.println("String is null.");
        }
    }
}