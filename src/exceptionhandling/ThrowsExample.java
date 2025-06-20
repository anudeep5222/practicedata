package exceptionhandling;


public class ThrowsExample {
    public static void main(String[] args) {
        try {
            divide(10, 0); // Calling method that may throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that declares it may throw an ArithmeticException
    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }
}
