package org.example.v2;


import org.example.demo.service.MessageSender;
import org.example.demo.service.SmsSender;

public class Main {
    public static void main(String[] args) {
        MessageSender sender = new SmsSender();
        NotificationService svc = new NotificationService(sender);
        svc.notify("0912...", "Hello!");
    }
}
