package com.design.patterns.creational.singleton;

/*
This class demonstrates singleton pattern using lazy initialization holder class.
This ensure that, we have lazy initialization without worrying about synchronization.
 */
public class LazyRegistryIODH {

    private LazyRegistryIODH() {
        System.out.println("I am in LazyRegistryIODH");
    }

    private static class RegistryHolder {
        public static volatile LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }
}