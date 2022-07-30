package com.alexncsr.homework.lesson_12;

public class PersonRunner {

    public static void main(String[] args) {

        Person p = new Person();
        long pId = p.getId();
        System.out.println(pId); // 1

        Person p2 = new Person();
        System.out.println(p2.getId()); // 2

        Person p3 = new Person();
        System.out.println(p3.getId()); // 3
    }
}
