package com.oop.PakcgesAndStaticLecture.staticAndNonStaticContext;

public class StaticBlock {
    static int a = 2;
    static int b = 3;

    //this is a static block
    static{
        System.out.println("this is a static block !");
        b = a * 2;
    }

    public static void main(String[] args) {
        // static block get executed once when the classe is loaded for the first time
        // class loaded for first time == first instance is created
        StaticBlock staticBlock = new StaticBlock();
        System.out.println(a + " " + b);

        StaticBlock staticBlock1 = new StaticBlock();
        System.out.println(a + " " + b);
    }
}
