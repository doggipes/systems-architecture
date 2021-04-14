package ru.systems.architecture.patterns.util;

//Singleton
public class EmailSingleton {
    private static EmailSender instance;

    public static EmailSender getInstance() {
        if (instance == null) {
            instance = new EmailSender();
        }
        return instance;
    }
}
