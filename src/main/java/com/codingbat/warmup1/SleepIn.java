package com.codingbat.warmup1;

public class SleepIn {

    /**
     *
     The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
    // is it a weekday or vacation ?
        if (!weekday || vacation) {
            //if yes then we sleep in
            return true;
            //if no then we do not sleep in
        } else {
            return false;
        }


    }
}
