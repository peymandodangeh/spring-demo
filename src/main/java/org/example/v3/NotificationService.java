package org.example.v3;

import org.example.demo.service.MessageSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationService {

    private static final Logger log =
            LoggerFactory.getLogger(NotificationService.class);

    private final MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notify(String to, String msg) {
        log.info("Preparing notification to {}", to);
        sender.send(to, msg);
        log.info("Notification sent to {}", to);
    }
}