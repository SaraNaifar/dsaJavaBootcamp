package com.oop.principalesoop.polymorphism;

public class Circle extends Shapes{
    // static polymorphism
    int calculateArea(int a , int b ){
        return a * b;
    }
    double calculateArea(double a , int b){
        return a + b;
    }

    double  calculateArea(int a , double b ){
        return a - b;
    }

    // dynamic polymorphism == overriding

     static void area(){
        System.out.println("this is circle area");
    }
}
