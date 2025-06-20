package exceptionhandling;


public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkAge(15); // Passing age below 18
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that throws an exception if age is below 18
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
        System.out.println("Access granted.");
    }
}
