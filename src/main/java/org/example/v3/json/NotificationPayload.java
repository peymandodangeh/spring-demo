package org.example.v3.json;


public class NotificationPayload {

    private String to;
    private String message;

    public NotificationPayload(String to, String message) {
        this.to = to;
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }
}
