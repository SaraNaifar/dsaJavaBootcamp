package com.oop.abstractClassAndInterfaceLecture.Interfaces;

// multiple inheritence is not allowed in java so we use interfaces
public class Car implements Engine, Break {
    @Override
    public void beak() {
        System.out.println("I break my car");
    }

    @Override
    public void start() {
        System.out.println("I can start my car");
    }

    @Override
    public void stop() {
        System.out.println("I can stop my car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate my car");
    }
}
