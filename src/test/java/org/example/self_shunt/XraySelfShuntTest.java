package org.example.self_shunt;

import org.example.Xray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class XraySelfShuntTest extends Xray {
    @Override
    protected void turnOn() {
        // do nothing
    }
    public boolean isOn() {
        return this.state;
    }

    @Test
    void alignToTheLeft() {
        XraySelfShuntTest xray = new XraySelfShuntTest();

        xray.align("left");

        assertEquals("left", xray.getAlignment());
        assertFalse(xray.isOn());
    }
}
