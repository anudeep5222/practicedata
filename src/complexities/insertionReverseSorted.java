package complexities;

public class insertionReverseSorted {

	public class InsertionSortReverseInput {
	    public static void insertionSort(int[] arr) {
	        int n = arr.length;
	        int shifts = 0;

	        for (int i = 1; i < n; i++) {
	            int key = arr[i];
	            int j = i - 1;           
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j--;
	                shifts++;
	            }

	            arr[j + 1] = key;
	        }

	        System.out.println("Total shifts: " + shifts);
	    }

	    public static void main(String[] args) {
	        int[] reverseSorted = {9, 7, 5, 3, 1};

	        insertionSort(reverseSorted);

	        System.out.print("Sorted array: ");
	        for (int num : reverseSorted) {
	            System.out.print(num + " ");
	        }
	    }
	}
