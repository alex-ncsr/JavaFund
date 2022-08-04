package com.alexncsr.homework.lesson14;

/*
 3. One class with three overloaded constructors.
Use "this" to assign the passed parameters to class properties.
 4. One class with three overloaded constructors using "this()".
 Use "this" to assign the passed parameters to class properties.
 */
public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    Employee(int id, String surname, int age) {
        this(surname, age);
        this.id = id;
    }

    Employee(int id, String surname, int age, double salary, String department) {
//        this (surname4, age4);
        this(id, surname, age);
        this.salary = salary;
        this.department = department;
    }

}
