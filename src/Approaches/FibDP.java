package Approaches;


import java.util.HashMap;
import java.util.Map;

public class FibDP {
    
    static Map<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input not allowed");
        if (n == 0) return 0;
        if (n == 1) return 1;

        
        if (memo.containsKey(n)) return memo.get(n);

        
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println( fibonacci(num));
    }
}
