package Approaches;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class SortingDuplicates {
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] && !duplicates.contains(arr[i])) {
                duplicates.add(arr[i]);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 3, 6};
        System.out.println(findDuplicates(array));
        
    }
}
