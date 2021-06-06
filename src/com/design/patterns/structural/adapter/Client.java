package com.design.patterns.structural.adapter;

public class Client {

    public static void main(String[] args) {
        //** using class/Two-way adapter
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner bs = new BusinessCardDesigner();
        String card = bs.designCard(adapter);
        System.out.println("card details are " + card);

        //** Using Object adapter
        System.out.println("**********************************");
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
        BusinessCardDesigner bs1 = new BusinessCardDesigner();
        String card1 = bs.designCard(adapter);
        System.out.println("card details are " + card1);

    }

    private static void populateEmployeeData(Employee employee) {
        employee.setJobTitle("SSE");
        employee.setName("atul pahuja");
        employee.setOfficeLocation("bangalore");
    }
}
