package org.example.test_specific_subclass;

public class Xray {
    private String direction = "center";
    protected boolean state = false;

    public void align(String direction) {
        this.turnOn();
        this.direction = direction;
    }

    protected void turnOn() {
        this.state = true;
    }

    public String getAlignment() {
        return this.direction;
    }
}
