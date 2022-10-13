package com.oop.abstractClassAndInterfaceLecture.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media media;
    public NiceCar(){
        this.engine = new ElectriqueEngine();
        this.media = new CdPlayer();
    }
    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        media.start();
    }

    public void stopMusic(){
        media.stop();
    }
}
