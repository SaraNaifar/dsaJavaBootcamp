package com.oop.GenericsAndLambdaLecture.generics;

public class Main {

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(5);
        list.add(52);
        list.add(8);
        System.out.println(list.toString());

        CustomArrayList<String> list2 = new CustomArrayList<>();
        list2.add("sara");
        list2.add("test");
        list2.add("test2");
        System.out.println(list2.toString());
    }
}
