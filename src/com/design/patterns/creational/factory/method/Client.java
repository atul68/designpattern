package com.design.patterns.creational.factory.method;

import com.design.patterns.creational.factory.User;

public class Client {

    public static void main(String[] args) {
        printUser(new AdminUserCreator());
        printUser(new UserCreator());
    }

    private static void printUser(Creator creator) {
        User user = creator.createUser();
        System.out.println(user);
    }
}
