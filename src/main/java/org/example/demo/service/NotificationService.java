package org.example.demo.service;

public class NotificationService {
    private final MessageSender sender = new EmailSender(); // وابستگی سخت

    public void notify(String to, String msg) {
        sender.send(to, msg);
    }

}
