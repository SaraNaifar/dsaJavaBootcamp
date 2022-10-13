package com.oop.abstractClassAndInterfaceLecture.Interfaces;

public class CdPlayer implements Media{
    @Override
    public void start() {
        System.out.println("start media player");
    }

    @Override
    public void stop() {
        System.out.println("stop media player");
    }

}
