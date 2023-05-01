package com.bridgelabz;

public class GenericsMain {

    static <T>void display(T string){
        System.out.println(string);
    }

    public static void main(String[] args) {

        String string = "Welcome to Generic Program using method level generics.";

        display(string);
    }
}
