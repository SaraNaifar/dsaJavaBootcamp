package com.oop.abstractClassAndInterfaceLecture.Interfaces;

public class ElectriqueEngine implements Engine{
    @Override
    public void start() {
        System.out.println("start electrique engine");
    }

    @Override
    public void stop() {
        System.out.println("stop electrique engine");
    }

    @Override
    public void acc() {
        System.out.println("accelerate electrique engine");
    }
}
