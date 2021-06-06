package com.design.patterns.creational.singleton;

/*
 This class uses eager initialization of singleton class
 */
public class EagerRegistry {

    public static final EagerRegistry INSTANCE = new EagerRegistry();

    private EagerRegistry() {
    }

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }
}