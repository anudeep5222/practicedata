package myCollections;


import java.util.HashMap;
import java.util.Map;

public class mapIterations {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Asha");
        map.put(2, "Raj");
        map.put(3, "Neha");

        System.out.println("1. Using entrySet() with for-each:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\n2. Using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        System.out.println("\n3. Using values():");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        System.out.println("\n4. Using forEach() and lambda:");
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
