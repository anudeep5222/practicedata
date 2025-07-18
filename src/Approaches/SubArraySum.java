package Approaches;


public class SubArraySum {
    public static void findSubarray(int[] arr, int targetSum) {
        int start = 0, currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > targetSum && start < end) {
                currentSum -= arr[start];
                start++;
            }

            
            if (currentSum == targetSum) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray found "+ targetSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;
        findSubarray(arr, targetSum);
    }
}
