package exceptionhandling;

public class ArrayHandler {
	
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Attempt to access an out-of-bounds index
            System.out.println(numbers[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds!"); 
        }

        System.out.println("Program continues smoothly...");
    }
}
