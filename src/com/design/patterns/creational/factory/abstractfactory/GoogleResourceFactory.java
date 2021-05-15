package com.design.patterns.creational.factory.abstractfactory;

import com.design.patterns.creational.factory.abstractfactory.instance.Ec2Instance;
import com.design.patterns.creational.factory.abstractfactory.instance.GoogleComputeEngineInstance;
import com.design.patterns.creational.factory.abstractfactory.instance.Instance;
import com.design.patterns.creational.factory.abstractfactory.storage.GoogleCloudStorage;
import com.design.patterns.creational.factory.abstractfactory.storage.S3Storage;
import com.design.patterns.creational.factory.abstractfactory.storage.Storage;

public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity cap) {
        return new GoogleComputeEngineInstance(cap);
    }

    @Override
    public Storage createStorage(int capacityInMb) {
        return new GoogleCloudStorage(capacityInMb);
    }
}
