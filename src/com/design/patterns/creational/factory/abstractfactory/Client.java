package com.design.patterns.creational.factory.abstractfactory;

import com.design.patterns.creational.factory.abstractfactory.instance.Instance;
import com.design.patterns.creational.factory.abstractfactory.storage.Storage;
import com.design.patterns.creational.factory.abstractfactory.instance.Instance.Capacity;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Capacity cap, int storageInMb) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageInMb);
        instance.attachedStorage(storage);
        return instance;
    }
    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance awsInstance = aws.createServer(Capacity.micro,204800);
        System.out.println("Aws instance is created " + awsInstance);
        awsInstance.start();
        awsInstance.stop();


        Client google = new Client(new GoogleResourceFactory());
        Instance googleInstance = google.createServer(Capacity.micro,204800);
        System.out.println("Google instance is created "+ googleInstance);
        googleInstance.start();
        googleInstance.stop();
    }
}
