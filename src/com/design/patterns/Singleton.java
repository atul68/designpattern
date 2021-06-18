package com.design.patterns;

import java.util.Arrays;


enum Singleton1 {
    INSTANCE;
}

public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {

        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


    public static void main (String args[]) {
        Singleton i = Singleton.getInstance();
    }

}
