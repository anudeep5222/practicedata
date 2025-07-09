package complexities;
import java.util.*;
public class ConstantTimeExamples {
	
	public static int getElement(int[] array, int index) {
		return array[index]; // Single operation regardless of array size
	}

	
	public static int add(int a, int b) {
		return a + b; // Fixed number of operations
	}

	
	public static void hashMapLookup() {
		Map<String, Integer> map = new HashMap<>();
		map.put("key", 42);
		int value = map.get("key"); // O(1) average case
		System.out.println("Value: " + value);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Element at index 2: " + getElement(arr, 2));
		System.out.println("Sum: " + add(5, 7));
		hashMapLookup();
	}
}
