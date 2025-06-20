package exceptionhandling;

public class ExceptionPropagaton {

    private int value;

    public ExceptionPropagaton(int value) {
        this.value = value;
    }

    public ExceptionPropagaton divide(int divisor) {
        try {
            value /= divisor;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
        return this; // Returning current object for method chaining
    }

    public ExceptionPropagaton multiply(int factor) {
        value *= factor;
        return this;
    }

    public ExceptionPropagaton showResult() {
        System.out.println("Result: " + value);
        return this;
    }

    public static void main(String[] args) {
        new ExceptionPropagaton(20)
            .divide(0)   // Triggers exception
            .multiply(5) 
            .showResult(); // Continues smoothly
    }
}
