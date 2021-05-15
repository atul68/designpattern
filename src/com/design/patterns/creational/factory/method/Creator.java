package com.design.patterns.creational.factory.method;

import com.design.patterns.creational.factory.User;

public abstract class Creator {

    public User getUser() {
        User user = createUser();
        return user;
    }

    //Factory method
    protected abstract User createUser();
}
