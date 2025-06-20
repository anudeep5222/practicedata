package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class frequencyCounter {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element frequencies:");
        for (Integer num : frequencyMap.keySet()) {
            System.out.println(num + " appears " + frequencyMap.get(num) + " times");
        }
    }
}
