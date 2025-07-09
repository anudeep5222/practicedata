package myCollections;


import java.util.LinkedList;

public class LinkedListLab {
    public static void main(String[] args) {
        
        LinkedList<String> cities = new LinkedList<>();

       
        cities.add("MumbaLinkedList");
        cities.add("Delhi");
        cities.add("Bangalore");
        System.out.println("Initial list: " + cities);

       
        System.out.println("First city: " + cities.get(0));

        
        cities.set(1, "Hyderabad");  
        System.out.println("After update: " + cities);

        
        cities.remove("Mumbai"); 
        cities.remove(0);        
        System.out.println("After removals: " + cities);

        
        System.out.println("Contains Bangalore? " + cities.contains("Bangalore"));

    
        System.out.println("Size of list: " + cities.size());

        
        System.out.println("Looping through:");
        for (String city : cities) {
            System.out.println(city);
        }

       
        cities.clear();
        System.out.println("List after clear: " + cities);

        
        System.out.println("Is list empty? " + cities.isEmpty());
    }
}
