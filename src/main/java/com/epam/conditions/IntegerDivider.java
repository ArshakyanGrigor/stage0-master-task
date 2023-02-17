package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        double part = 0;
        if (divider == 0) {
            System.out.println("division by zero");
        } else {
            part = dividend / divider;
            if (part * divider == dividend) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        }
    }
}
