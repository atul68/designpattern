package com.design.patterns.creational.singleton;

public class Client {

    public static void main(String[] args) {
//        EagerRegistry e = EagerRegistry(); because of private method we can't to create the instance of EagerRegistry

        /*
        this below code used for calling eager singleton example
         */
//        EagerRegistry registry1 = EagerRegistry.getInstance();
//        EagerRegistry registry2 = EagerRegistry.getInstance();
//        if(registry1 == registry2) {
//            System.out.println("Singleton implementation is working!!");
//        } else {
//            System.out.println("Singleton implementation is not working!!");
//        }

        /*
        this below code used for calling lazy singleton example with double check
         */
//        LazyRegistryWithDCL registry3 = LazyRegistryWithDCL.getInstance();
//        LazyRegistryWithDCL registry4 = LazyRegistryWithDCL.getInstance();
//        if(registry3 == registry4) {
//            System.out.println("Singleton implementation is working!!");
//        } else {
//            System.out.println("Singleton implementation is not working!!");
//        }

        /*
         this below code used for calling lazy singleton example of initialization holder class.
         */
        LazyRegistryIODH registry5;
        registry5 = LazyRegistryIODH.getInstance();

        LazyRegistryIODH registry6 = LazyRegistryIODH.getInstance();
        if(registry5 == registry6) {
            System.out.println("Singleton implementation is working!!");
        } else {
            System.out.println("Singleton implementation is not working!!");
        }

    }
}
