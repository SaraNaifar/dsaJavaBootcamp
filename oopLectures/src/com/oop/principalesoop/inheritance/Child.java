package com.oop.principalesoop.inheritance;

public class Child extends Base {
    double weight;

    Child(){
        super();
        this.weight= 4.4;
    }
    Child(double l, double w, double h, double weight ) {
        super(l,w,h);
        this.weight = weight;
        System.out.println(super.weight);
    }

    Child(double weight) {
        super(2);
        this.weight = weight;
    }

}
