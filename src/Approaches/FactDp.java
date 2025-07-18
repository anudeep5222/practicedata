package Approaches;

import java.util.HashMap;
import java.util.Map;

public  class FactDp {
    static Map<Integer, Integer> memo = new HashMap<>();

    public static int factorial(int n) {
        if (n<= 1)
            return 1;

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = n * factorial(n - 1);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));    
    }
}
