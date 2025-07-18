package Approaches;


public class SmallInRotatedSorted {
    public static int findMin(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                
                high = mid;
            }
        }

        return arr[low]; 
    }

    public static void main(String[] args) {
        int[] array = {6, 7, 8, 2, 3, 4, 5};
        System.out.println(findMin(array));
        
    }
}
