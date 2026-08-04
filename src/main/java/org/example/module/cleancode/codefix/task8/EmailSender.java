package org.example.module.cleancode.codefix.task8;

public class EmailSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}
