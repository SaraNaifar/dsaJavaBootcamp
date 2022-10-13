package com.oop.abstractClassAndInterfaceLecture.AbstractClasses;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("I will be a software engineer " );
    }

    @Override
    void partner() {
        System.out.println("I love Iron man");
    }
}
