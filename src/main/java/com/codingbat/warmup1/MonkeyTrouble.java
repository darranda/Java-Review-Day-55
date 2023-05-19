package com.codingbat.warmup1;

public class MonkeyTrouble {

    /**
     *We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
     We are in trouble if they are both smiling or if neither of them is smiling.
     Return true if we are in trouble.
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        //if they are booth smiling or if neither are smiling
    if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
        // we are in trouble!
        return true;
        //if neither is true, we are not in trouble
    } else {
        return false;
    }
}
}
