package org.example.humble_object;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void calculateSquareRoot() {
        MathHelper mathHelper = Mockito.mock(MathHelper.class);
        Calculator calculator = new Calculator(mathHelper);

        Mockito.when(mathHelper.sqrt(4)).thenReturn(2.0);

        double result = calculator.calculateSquareRoot(4);

        assertEquals(2, result);
    }
}