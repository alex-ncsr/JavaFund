package com.alexncsr.homework.lesson14;
/* One class with two or three methods. In the first method
   call the second and third method with "this" keyword.  */
public class MethodCallWithin {

    public int sum (int a, int b, int c) {
        return a + b + c;
    }

    public double average (int a, int b, int c){
        return (this.sum(a, b, c)) / 3;
    }
}
