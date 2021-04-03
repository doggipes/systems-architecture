package ru.systems.architecture.patterns;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.systems.architecture.patterns.entity.Iphone;
import ru.systems.architecture.patterns.entity.Phone;
import ru.systems.architecture.patterns.entity.PhoneType;
import ru.systems.architecture.patterns.factory.PhoneFactory;

@SpringBootApplication
public class PatternsApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(PatternsApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //Factory
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.createPhone(PhoneType.IPHONE);

        Shop shop = new Shop(phoneFactory);

        //Strategy
        Phone phone = shop.buyPhone(PhoneType.IPHONE);
        phone.payByNfc();
    }
}
