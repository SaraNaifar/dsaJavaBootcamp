package com.oop.accessControlLecture;

public class Parent {
    // public access modifier : we can access the variable num from any where in the project
    public int num;

    // variable with no modifier is accessible from same class, same packege but not from different package
    String name;

    //variable with protected access modifiers is only accessible from : same class, subClass in same package, subClass in another package
   protected int salary;
    public Parent(int num, String name) {
        this.num = num;
        this.name = name;
    }
}
