package myCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setImplementationsLab {
    public static void main(String[] args) {
        
        String[] elements = { "Banana", "Apple", "Orange", "Mango", "Apple", "Grapes" };

       
        Set<String> hashSet = new HashSet<>();
        for (String s : elements) {
            hashSet.add(s);
        }
        System.out.println("HashSet (no order): " + hashSet);

        
        Set<String> linkedHashSet = new LinkedHashSet<>();
        for (String s : elements) {
            linkedHashSet.add(s);
        }
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);

        
        Set<String> treeSet = new TreeSet<>();
        for (String s : elements) {
            treeSet.add(s);
        }
        System.out.println("TreeSet (sorted order): " + treeSet);

        
        System.out.println("TreeSet contains 'Mango'? " + treeSet.contains("Mango"));
        treeSet.remove("Banana");
        System.out.println("TreeSet after removing 'Banana': " + treeSet);
        System.out.println("Size of TreeSet: " + treeSet.size());
    }
}
