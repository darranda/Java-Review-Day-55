package com.codingbat.warmup1;

public class Diff21 {

    /**
     * Given an int n, return the absolute difference between n and 21,
     * except return double the absolute difference if n is over 21
     */

    public int diff21(int n) {
        //if n is over 21 return double
        if (n > 21) {
            return (n - 21) * 2;
            // return the difference between n and 21
        } else {
            return 21 - n;
        }
    }
}

