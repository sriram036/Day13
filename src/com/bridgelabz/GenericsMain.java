package com.bridgelabz;

public class GenericsMain {

    static <T extends Comparable<T>>void testMaximum(T x, T y, T z){
        T max = x;
        if (y.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        printMax(max);
    }

    static <T>void printMax(T max){
        System.out.println("The max value from printMax method is "+ max);
    }

    public static void main(String[] args) {

        testMaximum(5, 3, 82);
    }
}
