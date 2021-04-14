package ru.systems.architecture.patterns.factory;

import ru.systems.architecture.patterns.entity.PhoneType;
import ru.systems.architecture.patterns.entity.Iphone;
import ru.systems.architecture.patterns.entity.Phone;
import ru.systems.architecture.patterns.entity.Samsung;
import ru.systems.architecture.patterns.entity.Xiaomi;

public class PhoneFactory {

    public Phone createPhone(PhoneType type){
        Phone phone = null;

        switch (type) {
            case IPHONE:
                phone = new Iphone();
                break;
            case SAMSUNG:
                phone = new Samsung();
                break;
            case XIAOMI:
                phone = new Xiaomi();
                break;
        }

        return phone;
    }
}
