package ru.systems.architecture.patterns.entity;

import ru.systems.architecture.patterns.strategy.XiaomiNfcStrategy;

public class Xiaomi extends Phone {

    //Strategy
    public Xiaomi(){
        this.nfcStrategy = new XiaomiNfcStrategy();
    }
}
