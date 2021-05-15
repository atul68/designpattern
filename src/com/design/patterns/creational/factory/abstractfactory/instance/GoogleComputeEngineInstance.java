package com.design.patterns.creational.factory.abstractfactory.instance;

import com.design.patterns.creational.factory.abstractfactory.storage.Storage;

public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity cap) {
        System.out.println("Created GoogleComputeEngineInstance");
    }

    @Override
    public void start() {
        System.out.println("Started GoogleComputeEngineInstance");
    }

    @Override
    public void stop() {
        System.out.println("Stopped GoogleComputeEngineInstance");
    }

    @Override
    public void attachedStorage(Storage storage) {
        System.out.println("Attached " + storage + "to GoogleComputeEngineInstance");
    }

    @Override
    public String toString() {
        return "GoogleComputeEngineInstance{}";
    }
}
