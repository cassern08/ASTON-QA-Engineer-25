package org.example;

public class FactorialCalculate {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не может быть отрицательным");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}