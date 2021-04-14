package ru.systems.architecture.patterns.test;

import org.junit.Assert;
import org.junit.Test;
import ru.systems.architecture.patterns.entity.Iphone;
import ru.systems.architecture.patterns.entity.Phone;
import ru.systems.architecture.patterns.entity.PhoneType;
import ru.systems.architecture.patterns.entity.Samsung;
import ru.systems.architecture.patterns.factory.PhoneFactory;
import ru.systems.architecture.patterns.strategy.ApplePayNfcStrategy;
import ru.systems.architecture.patterns.util.EmailSender;
import ru.systems.architecture.patterns.util.EmailSingleton;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
    /*
     * Тестируем правильность работы Singleton
     */
    @Test
    public void testSingleton() {
        EmailSender emailSender1 = EmailSingleton.getInstance();
        EmailSender emailSender2 = EmailSingleton.getInstance();
        Assert.assertEquals(emailSender1, emailSender2);
    }

    /*
     * Тестируем что при создании телефона выбирается правильная стратегия
     */
    @Test
    public void testStrategyChoice() {
        Phone iphone = new PhoneFactory().createPhone(PhoneType.IPHONE);
        Assert.assertEquals(iphone.nfcStrategy.getClass(), ApplePayNfcStrategy.class);
    }

    /*
     * Тестируем что фабрика правильно создает Iphone
     */
    @Test
    public void testFactoryIphone() {
        Phone iphone = new PhoneFactory().createPhone(PhoneType.IPHONE);
        Assert.assertEquals(iphone.getClass(), Iphone.class);
    }

    /*
     * Тестируем что фабрика правильно создает Samsung
     */
    @Test
    public void testFactorySamsung() {
        Phone samsung = new PhoneFactory().createPhone(PhoneType.SAMSUNG);
        Assert.assertEquals(samsung.getClass(), Samsung.class);
    }


    /*
     * Тестируем что Samsung стратегия работает верно
     */
    @Test
    public void testSamsungStrategy() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Phone samsung = new PhoneFactory().createPhone(PhoneType.SAMSUNG);
        samsung.payByNfc();
        Assert.assertEquals("Pay by Samsung Pay", outputStream.toString());
    }


    /*
     * Тестируем что Apple стратегия работает верно
     */
    @Test
    public void testAppleStrategy() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Phone iphone = new PhoneFactory().createPhone(PhoneType.IPHONE);
        iphone.payByNfc();
        Assert.assertEquals("Pay by Apple Pay", outputStream.toString());
    }
}
