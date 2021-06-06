package com.design.patterns.creational.singleton;

/*
This class demonstrates singleton pattern using enum.
1. This ensure that, having a single instance created.
2. This ensure that, serialization-deserialization issue.

 */
public enum RegistryEnum {
    INSTANCE;

    public static RegistryEnum getInstance() {
        return INSTANCE;
    }
}
