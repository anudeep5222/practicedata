package Approaches;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesIterative {
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                    duplicates.add(arr[i]);
                }
            }
        }

        return duplicates;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 3, 6};
        System.out.println(findDuplicates(array));
       
    }
}
