package com.oop.abstractClassAndInterfaceLecture.AbstractClasses;

public abstract class Parent {
    int age;
    final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE = 5;
    }

    // because abstract class can have static methods
    static  void hobbies(){
          System.out.println("I love football");
      };
    abstract void career();
    abstract void partner();
}
