package org.example.test_specific_subclass;

public class SafeXray extends Xray {
    @Override
    protected void turnOn() {
        // do nothing
    }
    public boolean isOn() {
        return this.state;
    }
}
