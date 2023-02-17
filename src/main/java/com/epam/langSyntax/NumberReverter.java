package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reversNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversNumber = reversNumber * 10 + digit;
            number = number / 10;
        }
        System.out.println(reversNumber);
    }
}
