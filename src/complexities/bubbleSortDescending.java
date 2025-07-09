package complexities;

public class bubbleSortDescending {
    public static void SortDescending(String[] arr) {
        int n = arr.length;
        boolean swapped;

        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                   
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        String[] words = {"banana", "apple", "grape", "mango"};

        SortDescending(words);

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
