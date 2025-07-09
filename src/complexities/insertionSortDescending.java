package complexities;

public class insertionSortDescending {
    public static void insertionSortDesc(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5, 9};

        insertionSortDesc(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
