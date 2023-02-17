package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            isLeapYear = true;
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeapYear = true;
                else
                    isLeapYear = false;
            }
        } else {
            isLeapYear = false;
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("31");
            }
            case 2 -> {
                if (isLeapYear) {
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
            }
            case 4, 6, 9, 11 -> {
                System.out.println("30");
            }
            default -> {
                System.out.println("invalid date");
            }
        }
    }
}
