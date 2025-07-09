package recursion;

public class Fibonacci {
	public static int fibonacci(int n) {
		if (n <= 1) {
		return n; // Base cases
		}
		return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
		}
	public static void main(String[] args) {
		int terms = 10;
		
		System.out.println("Fibonacci sequence up to " + terms + " terms:");
		for (int i = 0; i < terms; i++) {
			System.out.print(fibonacci(i) + " ");

        }
	}
}
