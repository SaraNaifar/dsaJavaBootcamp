package com.oop.accessControlLecture;

public class Child extends Parent{

    public Child(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Parent parent = new Parent(22, "sara");
        String firstName = parent.name;
        int salary = parent.salary;
    }
}
