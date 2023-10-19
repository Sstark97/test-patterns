package org.example.test_specific_subclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XrayTest {
    @Test
    void alignToTheLeft() {
        SafeXray xray = new SafeXray();

        xray.align("left");

        assertEquals("left", xray.getAlignment());
        assertFalse(xray.isOn());
    }
}