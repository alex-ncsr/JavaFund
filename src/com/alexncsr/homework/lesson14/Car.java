package com.alexncsr.homework.lesson14;

/*5. One class with a method that has a parameter. When calling
the method, it should be posible to pass "this" as parameter.
 6. One class with a method or two that return a type of the
current class. Hint: using "this".  */

public class Car {

    String color;
    String engine;
    int power;

    public Car(){

    }

    public Car(String color, String engine, int power) {
        this.color = color;
        this.engine = engine;
        this.power = power;
    }

    public Car getCar () {
//        return new Car();
        return this;
    }

    void changeColor (Car car){
        car.color = color;
        System.out.println("Car color is " + color);
    }

    void showColor(){
        this.changeColor(this);
    }

}
