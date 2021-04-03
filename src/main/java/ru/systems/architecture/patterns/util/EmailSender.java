package ru.systems.architecture.patterns.util;

//Decorator
public class EmailSender {

    public void sendEmail(String to, String subject, String body){
        EmailSenderImpl emailSender = new EmailSenderImpl();
        emailSender.sendEmail(to, subject, body);
    }
}