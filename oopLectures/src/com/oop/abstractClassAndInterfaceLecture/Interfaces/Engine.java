package com.oop.abstractClassAndInterfaceLecture.Interfaces;

public interface Engine {
    // variables in interfaces are by default static and final because :
    // static: we cannot instantiate interface so we will access its variables through the class Name
    // final: we cannot not instantiate interface => we can't create a constructor in interface so we can't initiallise any varible
    // hence the variable is final
    static final int PRICE = 7000;

    void start();
    void stop();
    void acc();
}
