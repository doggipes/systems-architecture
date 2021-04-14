package ru.systems.architecture.patterns.strategy;

public class SamsungPayNfcStrategy implements NfcStrategy{
    @Override
    public void payByNfc() {
        System.out.println("Pay by Samsung Pay");
    }
}
