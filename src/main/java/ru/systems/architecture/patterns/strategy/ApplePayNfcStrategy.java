package ru.systems.architecture.patterns.strategy;

public class ApplePayNfcStrategy implements NfcStrategy{
    @Override
    public void payByNfc() {
        System.out.println("Pay by Apple Pay");
    }
}
