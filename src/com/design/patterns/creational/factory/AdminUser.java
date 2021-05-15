package com.design.patterns.creational.factory;

public class AdminUser extends  User {

    private String departName;
    private String departId;

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "departName='" + departName + '\'' +
                ", departId='" + departId + '\'' +
                "} " + super.toString();
    }
}
