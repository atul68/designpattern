package com.design.patterns.creational.prototype;

import javafx.geometry.Point3D;

public class Client {


    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman1 = new Swordsman();
        swordsman1.move(new Point3D( -10,10,10),20);
        swordsman1.attack();
        System.out.println(swordsman1);

        Swordsman swordsman2 = (Swordsman)swordsman1.clone();
        System.out.println("this swordsman is cloned "+swordsman2);

        General general1 = new General();
        General general2 = (General)general1.clone();
        System.out.println("this General is cloned "+general2);
    }
}
