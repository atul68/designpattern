package com.design.patterns.creational.prototype;

// Don't support cloning
public class General extends GameUnit {

    private String state = "idle";

    public void bootMoral() {
        this.state = "bootMoral";
    }

    @Override
    public String toString() {
     return "Swordsman" + state + "@" + getPosition();
    }

    @Override
    protected void reset()  {
        throw new UnsupportedOperationException("Reset is not supported!!");
    }

    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("General is unique");
    }
}
