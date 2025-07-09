package complexities;

public class findFirstOccurence {
    
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Keep searching to the left
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Binary search for 10: " + binarySearch(sortedArr, 10));
        
        int[] dupArr = {1, 2, 2, 2, 3, 4, 4, 5};
        System.out.println("First occurrence of 2: " + findFirstOccurrence(dupArr, 2));
    }
}
