package Approaches;

import java.math.BigInteger;

public class FactBinet {
    public static BigInteger fibonacci(int n) {
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        BigInteger prev = BigInteger.ZERO;
        BigInteger curr = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger next = prev.add(curr);
            prev = curr;
            curr = next;
        }

        return curr;
    }

    public static void main(String[] args) {
        int n = 500; 
        System.out.println( fibonacci(n));
    }
}
