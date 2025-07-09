package recursion;

public class DigitSum {
	public static int sumDigits(int n) {
		if (n < 10) {
			return n; // Base case
		}
		return n % 10 + sumDigits(n / 10); // Recursive case
	}

	public static void main(String[] args) {
		int number = 12345;
		System.out.println("Sum of digits in " + number + " is: " + sumDigits(number));
	}
}