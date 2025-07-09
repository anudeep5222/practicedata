package complexities;

public class bubbleSwap {
    public static int bubbleSortWithSwaps(int[] arr) {
        int n = arr.length;
        int swapCount = 0;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapCount++;
                    swapped = true;
                }
            }

            if (!swapped) break; 
        }

        return swapCount;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};

        int swaps = bubbleSortWithSwaps(numbers);

        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nTotal swaps: " + swaps);
    }
}

