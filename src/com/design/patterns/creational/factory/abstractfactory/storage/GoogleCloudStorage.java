package com.design.patterns.creational.factory.abstractfactory.storage;

public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMb) {
        System.out.println("Allocated " + capacityInMb + " on S3");
    }

    @Override
    public String getId() {
        return "S3";
    }

    @Override
    public String toString() {
        return "GoogleCloudStorage{}";
    }
}
