package myCollections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class advanceOperations {
    public static void main(String[] args) {
        // Step 1: Create and populate the ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 15, 20, 25, 30, 35, 40));
        System.out.println("Original list: " + numbers);

        // Step 2: Remove even numbers using Iterator
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        System.out.println("After removing evens: " + numbers);

        // Step 3: Replace all elements by multiplying them by 2
        numbers.replaceAll(n -> n * 2);
        System.out.println("After doubling elements: " + numbers);

        // Step 4: Convert to array
        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.println("Array form: " + Arrays.toString(array));

        // Step 5: Use subList to get the middle elements
        if (numbers.size() >= 3) {
            List<Integer> midSection = numbers.subList(1, numbers.size() - 1);
            System.out.println("Sublist (middle section): " + midSection);
        } else {
            System.out.println("Sublist not created — list has fewer than 3 elements.");
        }

        // Step 6: Modify elements by subtracting 1 (using index loop)
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) - 1);
        }
        System.out.println("After subtracting 1 from each element: " + numbers);
    }
}
