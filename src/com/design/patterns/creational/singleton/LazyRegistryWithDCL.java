package com.design.patterns.creational.singleton;

/*
This class demonstrates singleton pattern using double checking locking or classic singleton.
Although this implementation solves the multi-threading issue with lazy initialization using volatile and double checking locking,
volatile keyword guaranteed to work only after JVM starting with version 1.5 and later.
 */
public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL() {
    }

    public static volatile LazyRegistryWithDCL INSTANCE;

    public static LazyRegistryWithDCL getInstance() {
        if(INSTANCE == null) {
            synchronized (LazyRegistryWithDCL.class) {
                if(INSTANCE == null) {
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }
}