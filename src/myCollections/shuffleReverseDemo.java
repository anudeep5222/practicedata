package myCollections;

	
import java.util.*;

public class shuffleReverseDemo {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date"));

        // Shuffle the list randomly
        Collections.shuffle(items);
        System.out.println("Shuffled: " + items);

        // Reverse the list
        Collections.reverse(items);
        System.out.println("Reversed: " + items);
    }
}
