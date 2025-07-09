package recursion;

public class StringReversal {
	public static String reverseString(String str) {
		if (str.isEmpty()) {
			return str; 
		}
		return reverseString(str.substring(1)) + str.charAt(0); 
	}

	public static void main(String[] args) {
		String original = "Hello World";
		System.out.println("Original: " + original);
		System.out.println("Reversed: " + reverseString(original));
	}
}
