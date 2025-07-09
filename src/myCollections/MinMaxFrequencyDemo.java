package myCollections;


import java.util.*;

public class MinMaxFrequencyDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(42, 7, 19, 3, 99, 7, 19, 7);

        // Minimum and Maximum
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        // Frequency of a specific number
        int freqOf7 = Collections.frequency(numbers, 7);
        int freqOf19 = Collections.frequency(numbers, 19);

        System.out.println("Frequency of 7: " + freqOf7);
        System.out.println("Frequency of 19: " + freqOf19);
    }
}
