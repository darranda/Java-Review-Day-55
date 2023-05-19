package com.codingbat.warmup2;

public class ArrayCount {

    /**
     *Given an array of ints, return the number of 9's in the array.
     */
    public int arrayCount9(int[] nums) {

        int count = 0;
        for (int num : nums) {
            //if num equal 9 add to count;
            if (num == 9) {
                count++;
            }
        }
        // return total count of 9s
        return count;
    }
    }

