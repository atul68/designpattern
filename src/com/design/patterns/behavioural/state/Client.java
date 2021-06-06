package com.design.patterns.behavioural.state;

public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        
        order.paymentSuccessful();
        order.dispatched();
        
        order.cancel();
    }
}
