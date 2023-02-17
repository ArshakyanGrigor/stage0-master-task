package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        if (numberToPrint == 0) {
            System.out.println("0");
            return;
        }
        for (int i = 1; i < power; i++) {
            numberToPrint *= 10;
        }
        if (power % 2 == 0 && numberToPrint < 0) {
            numberToPrint *= -1;
        }
        System.out.println(numberToPrint);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
