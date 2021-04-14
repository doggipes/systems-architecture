package ru.systems.architecture.patterns.strategy;

public class XiaomiNfcStrategy implements NfcStrategy{
    @Override
    public void payByNfc() {
        System.out.println("Pay by Xiaomi Pay");
    }
}
