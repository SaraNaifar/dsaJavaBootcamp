package com.oop.PakcgesAndStaticLecture.staticAndNonStaticContext;

public class staticContext {
    public static void main(String[] args) {
        Human sara = new Human("sara", 30, 9000);
        // calling static variable with the class not the instance to avoid a warning
       // System.out.println( Human.population);
       fun();
    }
    static void fun(){
        System.out.println("this is fun cours");
        Human nour = new Human("nour", 22, 10000);
        nour.greeting();
    }
    void greeting(){
        System.out.println("hello community");
    }
}
