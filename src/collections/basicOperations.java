package collections;


import java.util.ArrayList;

public class basicOperations {
    public static void main(String[] args) {
        // 1. Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial List: " + fruits);

        // 3. Access elements
        System.out.println("First fruit: " + fruits.get(0));

        // 4. Update elements
        fruits.set(1, "Mango");
        System.out.println("After update: " + fruits);

        // 5. Remove elements
        fruits.remove("Apple"); // by value
        fruits.remove(0);       // by index
        System.out.println("After removals: " + fruits);

        // 6. Check if an element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // 7. Get size
        System.out.println("List size: " + fruits.size());

        // 8. Loop through elements
        System.out.println("Looping through list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 9. Clear all elements
        fruits.clear();
        System.out.println("List after clear: " + fruits);

        // 10. Check if empty
        System.out.println("Is the list empty? " + fruits.isEmpty());
    }
}
