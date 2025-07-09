package myCollections;



import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
       
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        
        treeMap.put(105, "Ravi");
        treeMap.put(101, "Asha");
        treeMap.put(103, "Neha");
        treeMap.put(102, "Raj");

        System.out.println("Initial TreeMap (sorted by key): " + treeMap);

        
        System.out.println("Value for key 101: " + treeMap.get(101));

        
        treeMap.put(102, "Priya");
        System.out.println("After updating key 102: " + treeMap);

        
        treeMap.remove(105);
        System.out.println("After removing key 105: " + treeMap);

        
        System.out.println("Contains key 103? " + treeMap.containsKey(103));
        System.out.println("Contains value 'Neha'? " + treeMap.containsValue("Neha"));

        
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());

        
        System.out.println("All entries:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        
        treeMap.clear();
        System.out.println("After clearing: " + treeMap);
        System.out.println("Is TreeMap empty? " + treeMap.isEmpty());
    }
}
