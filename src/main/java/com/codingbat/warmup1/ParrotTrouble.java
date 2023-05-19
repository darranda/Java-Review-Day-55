package com.codingbat.warmup1;

public class ParrotTrouble {

    /**
     * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
     * We are in trouble if the parrot is talking and the hour is before 7 or after 20.
     * Return true if we are in trouble
     */
    public boolean parrotTrouble(boolean talking, int hour) {
        // if parrot talking and house is before / after 20
        if (talking && (hour < 7 || hour > 20)) {
            // we are in trouble !
            return true;
            // if not we are not in trouble
        } else {
            return false;
        }
    }
}
