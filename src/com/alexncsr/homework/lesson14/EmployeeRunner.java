package com.alexncsr.homework.lesson14;

public class EmployeeRunner {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Smith", 25);
        System.out.println(emp1.surname); // Smith

        Employee emp2 = new Employee("Tramp", 77);
        System.out.println(emp2.department); // null
        System.out.println(emp2.age); // 77

        Employee emp3 = new Employee(2, "Bush", 40, 100.35, "IT");
        System.out.println(emp3.department); // IT
        System.out.println(emp3.id); // 2


    }
}
