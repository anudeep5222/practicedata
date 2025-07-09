package myCollections;


import java.util.*;

public class SearchingDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 19, 42, 99);
        Collections.sort(numbers); // Must be sorted

        int target = 25; // Not in the list
        int index = Collections.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println("Found at index: " + index);
        } else {
            int insertionPoint = -index - 1;
            System.out.println("Not found. Insertion point: " + insertionPoint);
            System.out.println("Returned value: " + index);
        }
    }
}
