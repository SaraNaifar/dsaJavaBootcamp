package com.oop.abstractClassAndInterfaceLecture.Interfaces;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        /*car.acc();
        car.start();
        car.beak();*/

        NiceCar niceCar = new NiceCar();

        niceCar.start();
        niceCar.startMusic();


    }
}
