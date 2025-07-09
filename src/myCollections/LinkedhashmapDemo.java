package myCollections;

	
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashmapDemo {
    public static void main(String[] args) {
        
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        
        map.put(101, "Asha");
        map.put(102, "Raj");
        map.put(103, "Neha");

        
        System.out.println("Initial LinkedHashMap: " + map);

       
        System.out.println("Value for key 102: " + map.get(102));

      
        map.put(102, "Ravi"); 
        System.out.println("After update: " + map);

        
        map.remove(101);
        System.out.println("After removing key 101: " + map);

        
        System.out.println("Contains key 103? " + map.containsKey(103));
        System.out.println("Contains value 'Neha'? " + map.containsValue("Neha"));

        // 8. Iterate using for-each
        System.out.println("Iterating entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 9. Clear the map
        map.clear();
        System.out.println("After clearing: " + map);

        // 10. Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());
    }
}
