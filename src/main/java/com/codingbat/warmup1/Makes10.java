package com.codingbat.warmup1;

public class Makes10 {

    /**
     *
     * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10
     */
    public boolean makes10(int a, int b) {
        // if one is 10 or the sum is 10 its true
        if  (a == 10 || b == 10 || a + b == 10) {
        return true;
        // if not its false
        } else {
            return false;
        }

    }
}
