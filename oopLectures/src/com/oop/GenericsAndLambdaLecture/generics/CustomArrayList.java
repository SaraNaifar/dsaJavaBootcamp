package com.oop.GenericsAndLambdaLecture.generics;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object [] data;
    private static int DEFAULT_SIZE = 10;
    private int index = 0;

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data);
    }
    public CustomArrayList() {
        // using object because parametrs type cannot be instantiated
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T a) {
        if ( isFull() ) {
            resize();
        }
        data[ index++ ] = a;
    }

    public T remove() {
        return (T)data[index--];
    }

    public boolean isFull() {
        return index == data.length;
    }

    public void resize() {
        Object[] temp = new Object [data.length * 2];
        // copying the data array to the new array with the doubeled size
        for( int i = 0; i< data.length; i++){
            temp[i] =  data[i];
        }
        data = temp;
    }


}
