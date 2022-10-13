package com.oop.abstractClassAndInterfaceLecture.Interfaces.extendedDemo;

public class Main implements B{
    @Override
    public void fun() {
        System.out.println("go and have fun");
    }

    @Override
    public void work() {
        System.out.println("go and work hard");
    }
    // cannot put access modifiers for overrided methods weaker then methods on the implemented interface
    /*@Override
    protected void work() {
        System.out.println("go and work hard");
    }*/

    public static void main(String[] args) {
        Main mainClass = new Main();
        mainClass.fun();
        B.read();

    }
}
