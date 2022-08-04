package com.alexncsr.homework.lesson14;

import static java.lang.Math.PI;

// One class with 3 overloaded methods.
public class MethodOverloading {

    public static int calcArea(int length, int width) {
        return length * width;
    }

    public static double calcArea(double radius) {
        return PI * radius * radius;
    }

    public static int calcArea(int length) {
        return length * length;
    }

}
