package com.alexncsr.homework.lesson_12;

public class Person {
    private static long id;
    private String firstName;
    private String lastName;

    public Person() {

        id++;
    }

    public long getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


