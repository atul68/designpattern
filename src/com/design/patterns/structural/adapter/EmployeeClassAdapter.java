package com.design.patterns.structural.adapter;

public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
