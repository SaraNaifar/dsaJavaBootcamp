package com.oop.abstractClassAndInterfaceLecture.Interfaces.extendedDemo;

public interface B extends A{
    public void work();

    // cannot put access modifiers for overrided methods weaker then methods on the implemented interface
    /*@Override
    protected void work() {
        System.out.println("go and work hard");
    }*/
    static void read(){
        System.out.println("I love reading");
    }
}
