package Approaches;

public class fibIterative {
    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(fibonacci(num));
    }
}
