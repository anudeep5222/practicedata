package Approaches;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesHashSet {
    public static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2,4,5,3,6};
        System.out.println(findDuplicates(array));
        
    }
}
