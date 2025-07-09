package myCollections;

	 
import java.util.HashSet;
import java.util.Set;

public class BasicSetLab {
    public static void main(String[] args) {
        // 1. Create a HashSet
        Set<String> names = new HashSet<>();

        // 2. Add elements
        names.add("Asha");
        names.add("Raj");
        names.add("Neha");
        names.add("Raj"); // duplicate will be ignored
        System.out.println("Set after adding elements: " + names);

        // 3. Check if element exists
        System.out.println("Contains Raj? " + names.contains("Raj"));

        // 4. Remove an element
        names.remove("Asha");
        System.out.println("After removing Asha: " + names);

        // 5. Get size
        System.out.println("Size of set: " + names.size());

        // 6. Loop through elements
        System.out.println("Looping through set:");
        for (String name : names) {
            System.out.println(name);
        }

        // 7. Clear the set
        names.clear();
        System.out.println("After clearing: " + names);

        // 8. Check if set is empty
        System.out.println("Is set empty? " + names.isEmpty());
    }
}
