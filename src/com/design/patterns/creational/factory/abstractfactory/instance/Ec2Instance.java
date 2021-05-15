package com.design.patterns.creational.factory.abstractfactory.instance;

import com.design.patterns.creational.factory.abstractfactory.storage.Storage;

public class Ec2Instance implements Instance {

    public Ec2Instance(Capacity cap) {
        System.out.println("Created Ec2Instance");
    }
    @Override
    public void start() {
        System.out.println("Started Ec2Instance");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Ec2Instance");
    }

    @Override
    public void attachedStorage(Storage storage) {
        System.out.println("Attached " + storage + "to Ec2Instance");
    }

    @Override
    public String toString() {
        return "Ec2Instance";
    }
}
