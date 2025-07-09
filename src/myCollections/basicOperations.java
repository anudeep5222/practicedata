package myCollections;


import java.util.ArrayList;

public class basicOperations {
    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();

       
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial List: " + fruits);

        
        System.out.println("First fruit: " + fruits.get(0));

        
        fruits.set(1, "Mango");
        System.out.println("After update: " + fruits);

        
        fruits.remove("Apple"); // by value
        fruits.remove(0);       // by index
        System.out.println("After removals: " + fruits);

        
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

       
        System.out.println("List size: " + fruits.size());

      
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
