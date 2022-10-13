package com.oop.abstractClassAndInterfaceLecture.AbstractClasses;

public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I will be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love wonder women");
    }
}
