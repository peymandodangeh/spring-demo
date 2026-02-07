package org.example.v3.json;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.example.demo.service.MessageSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
@ComponentScan("org.example.v3.json")
public class NotificationService {

    private static final Logger log =
            LoggerFactory.getLogger(NotificationService.class);

    private final MessageSender sender;
    private final JsonSerializer json;

    public NotificationService(MessageSender sender,
                               JsonSerializer json) {
        this.sender = sender;
        this.json = json;
    }

    public void notify(String to, String msg) {
        NotificationPayload payload =
                new NotificationPayload(to, msg);

        String jsonPayload = json.toJson(payload);

        log.info("Sending payload {}", jsonPayload);
        sender.send(to, msg);
    }

    @PostConstruct
    public void init() {
        log.info("Bean initialized");
    }

    @PreDestroy
    public void destroy() {
        log.info("Bean destroyed");
    }

}

