package com.design.patterns.creational.factory.abstractfactory.instance;

import com.design.patterns.creational.factory.abstractfactory.storage.Storage;

// Represent an abstract product
public interface Instance {

    enum Capacity {micro,small,large};

    void start();

    void stop();

    void attachedStorage(Storage storage);
}
