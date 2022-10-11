package com.oop.accessControlLecture;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent(22, "sara");

        // public variable is accessible from anywhere in the project
        int n = parent.num;
        System.out.println(n);

        String firstName = parent.name;


    }
}
