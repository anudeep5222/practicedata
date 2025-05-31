package first;

import java.util.Scanner;
import java.util.Random;
public class guessGame {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		final Scanner scanner = new Scanner(System.in);
		final Random random = new Random();
		final int secretNum = random.nextInt(100) + 1;
		int attempts = 0;
		boolean guessed = false;

		System.out.println("guess a num b/w 1 to 100");
		while (!guessed) {
			final int guess = scanner.nextInt();
			attempts++;

			if (guess == secretNum) {
				guessed = true;
				System.out.println("correct! " + attempts + "atempsts");
			} else if (guess < secretNum) {
				System.out.println("too lo try again ");
			} else {
				System.out.println("too high ");
			}
		}

	}

}
