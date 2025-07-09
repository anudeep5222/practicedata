package myCollections;


import java.util.HashMap;
import java.util.Map;

public class BasicMap {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        
        map.put(101, "Asha");
        map.put(102, "Raj");
        map.put(103, "Neha");
        System.out.println("Initial map: " + map);

       
        System.out.println("Value for key 102: " + map.get(102));

       
        map.put(102, "Ravi"); // replaces "Raj" with "Ravi"
        System.out.println("After update: " + map);

        
        map.remove(101);
        System.out.println("After removing key 101: " + map);

        // 6. Check if a key or value exists
        System.out.println("Contains key 103? " + map.containsKey(103));
        System.out.println("Contains value 'Neha'? " + map.containsValue("Neha"));

        
        System.out.println("Map size: " + map.size());

        
        System.out.println("Looping through map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        
        map.clear();
        System.out.println("After clearing: " + map);

        
        System.out.println("Is map empty? " + map.isEmpty());
    }
}
