package com.design.patterns.creational.factory.abstractfactory;

import com.design.patterns.creational.factory.abstractfactory.instance.Instance;
import com.design.patterns.creational.factory.abstractfactory.storage.Storage;
import com.design.patterns.creational.factory.abstractfactory.instance.Instance.Capacity;

public interface ResourceFactory {

    Instance createInstance(Capacity cap);

    Storage createStorage(int capacityInMb);
}