package debugging;

public class OffByOneBug {
public static void main(String[] args) {
	int[] arr = {10, 20, 30, 40, 50};
	for (int i = 0; i < arr.length; i++) { // 💥ArrayIndexOutOfBounds
		System.out.println(arr[i]);
		}
	}
}