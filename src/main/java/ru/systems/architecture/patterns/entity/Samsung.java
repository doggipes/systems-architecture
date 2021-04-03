package ru.systems.architecture.patterns.entity;

import ru.systems.architecture.patterns.strategy.SamsungPayNfcStrategy;

public class Samsung extends Phone {

    //Strategy
    public Samsung(){
        this.nfcStrategy = new SamsungPayNfcStrategy();
    }
}
