package com.design.patterns.creational.factory.method;

import com.design.patterns.creational.factory.User;

public class UserCreator extends Creator {
    @Override
    protected User createUser() {
        return new User();
    }
}
