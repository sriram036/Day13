package com.bridgelabz;

public class GenericsMain {

    static <T extends Comparable<T>>T findMaxString(T x, T y, T z){
        T max = x;
        if (y.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Max number of given  integers is " + findMaxString("Apple", "Peach", "Banana"));
    }
}
