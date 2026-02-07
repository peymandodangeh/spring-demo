package org.example.v2;

import org.example.demo.service.MessageSender;

public class NotificationService {

    private final MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notify(String to, String msg) {
        sender.send(to, msg);
    }
}
