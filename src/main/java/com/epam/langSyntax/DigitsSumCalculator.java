package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            number = number / 10;
            sum += digit;
        }
        System.out.println(sum);
    }
}
