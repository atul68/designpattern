package com.design.patterns.creational.factory.simple;

import com.design.patterns.creational.factory.User;

public class Client {

    public static void main(String[] args) {
        User adminUser = UserFactory.createUser("ADMIN");
        User user = UserFactory.createUser("USER");
        System.out.println("adminUser" + adminUser);
        System.out.println("user" + user);
    }
}
