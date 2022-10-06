package com.oop.introduction;


public class introducationLecture {

    public static void main(String[] args) {

        
        Student student2 = new Student(11,"sara", 92.3f);
        System.out.println(student2.rollNumber);
        System.out.println(student2.name);
        System.out.println(student2.gpa);

             
        Student student3 = new Student(26,"nour", 94.53f);
        System.out.println(student3.rollNumber);
        System.out.println(student3.name);
        System.out.println(student3.gpa);
    }
    
}
