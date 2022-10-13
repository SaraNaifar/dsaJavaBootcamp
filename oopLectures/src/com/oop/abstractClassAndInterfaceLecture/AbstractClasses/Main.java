package com.oop.abstractClassAndInterfaceLecture.AbstractClasses;

public class Main {

    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(28);
        daughter.career();
        System.out.println(daughter.VALUE);


        // because static method are accesssible via the class where its declared
        Parent.hobbies();
    }
}

