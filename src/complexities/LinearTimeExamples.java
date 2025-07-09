package complexities;

public class LinearTimeExamples {

    // Finding maximum in unsorted array
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // Counting specific elements
    public static int countOccurrences(int[] arr, int target) {
        if (arr == null) return 0;
        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }
        return count;
    }

    // String reversal
    public static String reverseString(String s) {
        if (s == null) return null;
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println("Max number: " + findMax(numbers));
        System.out.println("Count of 1s: " + countOccurrences(numbers, 1));
        System.out.println("Reversed string: " + reverseString("algorithm"));
    }
}
