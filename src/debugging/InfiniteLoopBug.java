package debugging;



public class InfiniteLoopBug {
	public static void main(String[] args) {
		int i = 1;
		while (i < 10) {
			System.out.println("i = " + i);
			i += 2; // Skips 10, so loop never ends
		}
	}
}
