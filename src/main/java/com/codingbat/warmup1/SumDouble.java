package com.codingbat.warmup1;

public class SumDouble {
    /**
     * Given two int values, return their sum.
     * Unless the two values are the same, then return double their sum.
     */

    public int sumDouble(int a, int b) {
        // sum of two values
        int sum = a + b;
        // if values are the same , double the sum
        if (a == b) {
            return sum *= 2;
        }
        // if not the same return the sum
        return sum;
    }
}

