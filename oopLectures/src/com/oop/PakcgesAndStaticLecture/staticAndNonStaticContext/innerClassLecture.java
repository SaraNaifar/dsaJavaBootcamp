package com.oop.PakcgesAndStaticLecture.staticAndNonStaticContext;

public class innerClassLecture {
    // this is inner class end it can be static
    static class A {
        String name ;

        public A(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        // when A is non static it depends on innerClass instance that is why we cant instantiatet
        // the solution is to make A static or create instance of innerClassLecture
        A  a = new A("sara");
        System.out.println(a.name);
    }
}
