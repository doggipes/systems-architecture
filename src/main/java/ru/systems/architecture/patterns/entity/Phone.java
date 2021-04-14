package ru.systems.architecture.patterns.entity;

import ru.systems.architecture.patterns.strategy.NfcStrategy;

public class Phone {
    public NfcStrategy nfcStrategy;

    public void turnOn(){
        System.out.println("Phone turn on");
    }

    public void turnOff(){
        System.out.println("Phone turn off");
    }

    public void volumeUp(){
        System.out.println("Phone volume up");
    }

    public void volumeDown(){
        System.out.println("Phone volume down");
    }

    public void payByNfc(){
        nfcStrategy.payByNfc();
    }
}
