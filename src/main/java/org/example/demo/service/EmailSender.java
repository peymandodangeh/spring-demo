package org.example.demo.service;


public class EmailSender implements MessageSender {

    @Override
    public void send(String to, String message) {
        System.out.println("[EMAIL] to=" + to + " msg=" + message);
    }
}
