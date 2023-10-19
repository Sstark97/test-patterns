package org.example.humble_object;

public class Calculator {
    private final MathHelper mathHelper;

    public Calculator(MathHelper mathHelper) {
        this.mathHelper = mathHelper;
    }

    public double calculateSquareRoot(double number) {
        // Lógica para calcular la raíz cuadrada
        return mathHelper.sqrt(number);
    }
}
