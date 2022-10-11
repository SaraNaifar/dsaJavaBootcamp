package com.oop.principalesoop.polymorphism;

public class Main {

    public static void main(String[] args) {

        Shapes shape = new Circle();

        // static method of the parent class get called because static method cannot be overriding
        // oevrriding depends on object HENCE static does not depends on objject that is way static cannot be overrided
        // BUT it can herited
        shape.area();

        // BUT static method can herited
        Circle circle = new Circle();
        Shapes.draw();
    }
}
