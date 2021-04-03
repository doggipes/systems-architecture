package ru.systems.architecture.patterns.entity;

import ru.systems.architecture.patterns.strategy.ApplePayNfcStrategy;

public class Iphone extends Phone {

    //Strategy
    public Iphone(){
        this.nfcStrategy = new ApplePayNfcStrategy();
    }
}
