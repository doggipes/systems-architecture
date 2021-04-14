package ru.systems.architecture.patterns;

import ru.systems.architecture.patterns.entity.Phone;
import ru.systems.architecture.patterns.entity.PhoneType;
import ru.systems.architecture.patterns.factory.PhoneFactory;
import ru.systems.architecture.patterns.util.EmailSender;
import ru.systems.architecture.patterns.util.EmailSingleton;

public class Shop {

    //Factory
    private final PhoneFactory phoneFactory;

    //Decorator
    private final EmailSender emailSender = EmailSingleton.getInstance();


    public Shop(PhoneFactory phoneFactory) {
        this.phoneFactory = phoneFactory;
    }

    //Factory
    public Phone buyPhone(PhoneType type){
        Phone phone = phoneFactory.createPhone(type);

        phone.turnOn();
        phone.volumeUp();
        phone.volumeDown();
        phone.turnOff();

        //Decorator
        emailSender.sendEmail("idzhalil@gmail.com", "Purchase", "You buy " + type.name());

        return phone;
    }
}
