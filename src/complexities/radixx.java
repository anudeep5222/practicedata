package complexities;
import java.util.Arrays;
public class radixx {
	
	public static void radixSort(int[] arr) {
		if (arr.length == 0)
			return;

		int max = Arrays.stream(arr).max().getAsInt();

		for (int exp = 1; max / exp > 0; exp *= 10) {
			countingSortByDigit(arr, exp);
		}
	}

	private static void countingSortByDigit(int[] arr, int exp) {
		int n = arr.length;
		int[] output = new int[n];
		int[] count = new int[10]; // Digits 0–9

		
		for (int i = 0; i < n; i++) {
			int digit = (arr[i] / exp) % 10;
			count[digit]++;
		}

		
		for (int i = 1; i < 10; i++) {
			count[i] += count[i - 1];
		}

		
		for (int i = n - 1; i >= 0; i--) {
			int digit = (arr[i] / exp) % 10;
			output[--count[digit]] = arr[i];
		}

		System.arraycopy(output, 0, arr, 0, n);
	}

	public static void main(String[] args) {
		int[] numbers = { 170, 45, 75, 90, 802, 24, 2, 66 };

		radixSort(numbers);

		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
}
