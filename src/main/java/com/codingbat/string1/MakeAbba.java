package com.codingbat.string1;

public class MakeAbba {
    /**
     * Given two strings, a and b, return the result of putting them together in the order abba
     * e.g. "Hi" and "Bye" returns "HiByeByeHi"
     */
    public static String makeAbba(String a, String b) {
    //return the result of putting them together in the order abba
        return a + b + b + a;
    }
}
