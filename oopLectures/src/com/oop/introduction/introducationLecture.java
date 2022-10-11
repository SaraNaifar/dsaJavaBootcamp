package com.oop.introduction;


import com.oop.accessControlLecture.Parent;

public class introducationLecture extends Parent{

    public introducationLecture(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {

        
        Student student2 = new Student(11,"sara", 92.3f);
        System.out.println(student2.rollNumber);
        System.out.println(student2.name);
        System.out.println(student2.gpa);

             
        Student student3 = new Student(26,"nour", 94.53f);
        System.out.println(student3.rollNumber);
        System.out.println(student3.name);
        System.out.println(student3.gpa);

        Parent parent = new Parent(22, "sara");
        introducationLecture child2 = new introducationLecture(22, "sara");
        // cannot access name varibale from another package because it is with no modifier
        //String firstName = parent.name;

        int salary = child2.salary;
    }
    
}
