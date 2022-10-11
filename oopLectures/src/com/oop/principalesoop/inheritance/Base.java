package com.oop.principalesoop.inheritance;

public class Base {

    double l;
    double w;
    double h;

    double weight = 5.0;

    Base (double h){
        super();
        this.h = h;
    }

    Base(){
      this.l = -1;
      this.w = -1;
      this.h = -1;
    }

    Base(double l, double w, double h){
        this.l = l;
        this.h = h;
        this.w = w;
    }

}
