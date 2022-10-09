package com.oop.PakcgesAndStaticLecture.SingletonClass;

import static java.util.Objects.isNull;

public class Singleton  {

    // used when we want to create only one instance of this class
    // first sol: meking the constructor private => we can't create even the first instance
    // the main solution is using get for instance variable decalred in the class singleton it self
    private Singleton(){

    }
    public static Singleton instance;
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
