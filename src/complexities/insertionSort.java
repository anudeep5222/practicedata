package complexities;

public class insertionSort {
    public static void insertion(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {8, 4, 1, 3, 5};

        insertion(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
