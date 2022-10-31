package com.oop.GenericsAndLambdaLecture.CompareObjects;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student sara = new Student(2, 55.3f);
        Student nour = new Student(11, 95.2f);
        Student adnen = new Student(1, 85.2f);
        Student maro = new Student(3, 63.2f);

        Student[] students = {sara, nour, adnen, maro};
        // to compare two object with specific attribute we need to implement interface Comparable
        if(sara.compareTo(nour) < 0 ){
            System.out.println("nour got better marks ");
        }

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


        Arrays.sort(students, (Student o1, Student o2)-> (int)(o1.mark - o2.mark));


    }


}
