package org.example.v3.json;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        NotificationService svc = ctx.getBean(NotificationService.class);
        svc.notify("user@example.com", "Hello from Spring!");

        ctx.close();
    }
}
