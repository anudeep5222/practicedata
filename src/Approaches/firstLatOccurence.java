package Approaches;

public class firstLatOccurence {
    public static int FirstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return first;
    }

    public static int LastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return last;
    }

    public static void main(String[] args) {
        int[] array = {1, 9, 9,9 , 3, 9, 5};
        int target = 9;

        int first = FirstOccurrence(array, target);
        int last = LastOccurrence(array, target);

        System.out.println("First index: " + first); 
        System.out.println("Last index: " + last);  
    }
}
