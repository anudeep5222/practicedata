package exceptionhandling;


import java.util.LinkedList;

public class lla {
    public static void main(String[] args) {
        // 1. Create a LinkedList
        LinkedList<String> cities = new LinkedList<>();

        // 2. Add elements
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        System.out.println("Initial list: " + cities);

        // 3. Access elements
        System.out.println("First city: " + cities.get(0));

        // 4. Update an element
        cities.set(1, "Hyderabad");  // Replace "Delhi" with "Hyderabad"
        System.out.println("After update: " + cities);

        // 5. Remove elements
        cities.remove("Mumbai"); // Remove by value
        cities.remove(0);        // Remove by index
        System.out.println("After removals: " + cities);

        // 6. Check for an element
        System.out.println("Contains Bangalore? " + cities.contains("Bangalore"));

        // 7. Get size
        System.out.println("Size of list: " + cities.size());

        // 8. Loop through elements
        System.out.println("Looping through:");
        for (String city : cities) {
            System.out.println(city);
        }

        // 9. Clear the list
        cities.clear();
        System.out.println("List after clear: " + cities);

        // 10. Check if empty
        System.out.println("Is list empty? " + cities.isEmpty());
    }
}
