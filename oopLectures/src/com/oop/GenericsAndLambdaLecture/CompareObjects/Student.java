package com.oop.GenericsAndLambdaLecture.CompareObjects;

public class Student implements Comparable<Student> {

    int rollNum;
    float mark;

    public Student(int rollNum, float mark) {
        this.rollNum = rollNum;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return mark +" ";
    }


    @Override
    public int compareTo(Student o) {
        return (this.rollNum - o.rollNum);
    }
}
