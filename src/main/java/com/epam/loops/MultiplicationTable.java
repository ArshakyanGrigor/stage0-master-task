package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 1; i <= 10; i++) {
            int number = i * numberTableToPrint;
            System.out.println(i + " x " + numberTableToPrint + " = " + number);
        }
    }
}
