package complexities;

public class insertionForAlreadySorted {

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
        int[] sorted = {1, 2, 3, 4, 5};
        insertionSort(sorted);

        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
