package complexities;


public class countingSort {
    public static void CountingSort(int[] arr) {
        if (arr.length == 0) return;

        
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }

        
        int[] count = new int[max + 1];

        
        for (int num : arr) {
            count[num]++;
        }

        
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 2, 8, 3, 3, 1};

        CountingSort(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
