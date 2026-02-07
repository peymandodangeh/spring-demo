package org.example.v3;


import org.example.demo.service.EmailSender;
import org.example.demo.service.MessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MessageSender messageSender() {
        return new EmailSender();
    }

    @Bean
    public NotificationService notificationService(MessageSender sender) {
        return new NotificationService(sender);
    }
}

