package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength == 0) {
            System.out.print("");
        }
        int count = 1;
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = cathetusLength; j > 0; j--) {
                if (j <= count) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            count++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
