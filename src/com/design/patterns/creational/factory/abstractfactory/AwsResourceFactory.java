package com.design.patterns.creational.factory.abstractfactory;

import com.design.patterns.creational.factory.abstractfactory.instance.Ec2Instance;
import com.design.patterns.creational.factory.abstractfactory.instance.Instance;
import com.design.patterns.creational.factory.abstractfactory.instance.Instance.Capacity;
import com.design.patterns.creational.factory.abstractfactory.storage.S3Storage;
import com.design.patterns.creational.factory.abstractfactory.storage.Storage;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Capacity cap) {
        return new Ec2Instance(cap);
    }

    @Override
    public Storage createStorage(int capacityInMb) {
        return new S3Storage(capacityInMb);
    }
}
