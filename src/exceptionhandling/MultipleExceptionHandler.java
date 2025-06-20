package exceptionhandling;

public class MultipleExceptionHandler {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};

            // Attempting out-of-bounds access
            System.out.println(numbers[5]);

            // Attempting division by zero
            int result = 10 / 0;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {  // Catching any other exceptions
            System.out.println("General error occurred: " + e.getMessage());
        }

        System.out.println("Program continues smoothly...");
    }
}
