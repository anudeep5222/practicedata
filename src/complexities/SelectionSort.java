package complexities;



public class SelectionSort {
    public static void reverseRightSelectionSort(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            int maxIndex = 0;

            
            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 3};

        reverseRightSelectionSort(numbers);

       
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}


