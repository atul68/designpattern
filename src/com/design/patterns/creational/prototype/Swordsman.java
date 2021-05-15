package com.design.patterns.creational.prototype;

public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attack() {
        this.state = "attack";
    }

    @Override
    protected void reset() {
        this.state = "idle";
    }

    @Override
    public String toString() {
     return "Swordsman" + state + "@" + getPosition();
    }
}
