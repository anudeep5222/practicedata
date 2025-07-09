package myCollections;



	
import java.util.*;

public class SortingDemo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry", "date");
        List<Integer> numbers = Arrays.asList(42, 7, 19, 3, 99);

        // 1. Alphabetical sorting
        List<String> alphabetical = new ArrayList<>(words);
        Collections.sort(alphabetical);
        System.out.println("Alphabetical: " + alphabetical);

        // 2. Natural order sorting for numbers
        List<Integer> naturalNumbers = new ArrayList<>(numbers);
        Collections.sort(naturalNumbers);
        System.out.println("Numbers (natural order): " + naturalNumbers);

        // 3. Custom sorting by length of strings
        List<String> byLength = new ArrayList<>(words);
        Collections.sort(byLength, Comparator.comparing(String::length));
        System.out.println("By length: " + byLength);

        
        List<String> reverseAlpha = new ArrayList<>(words);
        List<Integer> reverseNums = new ArrayList<>(numbers);
        Collections.sort(reverseAlpha, Collections.reverseOrder());
        Collections.sort(reverseNums, Collections.reverseOrder());
        System.out.println("Alphabetical (reverse): " + reverseAlpha);
        System.out.println("Numbers (reverse): " + reverseNums);
    }
}
