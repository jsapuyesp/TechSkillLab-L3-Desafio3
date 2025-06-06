package org.example.calculator.refactored.imp;

public class ImpuestoIVA implements ImpEstrategia {
    private static final double IVA_RATE = 0.15;

    @Override
    public double calcular(double amount) {
        return amount * IVA_RATE;
    }
}
