package com.design.patterns.creational.factory.simple;

import com.design.patterns.creational.factory.AdminUser;
import com.design.patterns.creational.factory.User;

public class UserFactory {

    public static User createUser(String type) {
        switch(type) {
            case "USER" :
                return new User();
            case "ADMIN":
                return new AdminUser();
            default:
                throw new IllegalArgumentException("uset type unknown");
        }
    }
}
