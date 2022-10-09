package com.oop.PakcgesAndStaticLecture.staticAndNonStaticContext;

public class Human {
    String name;
    int age;
    int salary;
    //Declaring static variable that concern only the class but not the instances
    static long population;
    public Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        // accessing the static variable through the class where its declared
        Human.population+=1;
    }
    public void greeting(){
        System.out.println("it s me a Human beeing!!");
    }
}
