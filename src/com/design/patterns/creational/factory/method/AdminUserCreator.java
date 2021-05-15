package com.design.patterns.creational.factory.method;

import com.design.patterns.creational.factory.AdminUser;
import com.design.patterns.creational.factory.User;

public class AdminUserCreator extends Creator {
    @Override
    protected User createUser() {
        return new AdminUser();
    }
}
