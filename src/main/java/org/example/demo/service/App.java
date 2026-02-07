package org.example.demo.service;

import org.example.demo.service.NotificationService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        NotificationService svc = new NotificationService();
        svc.notify("user@example.com", "Hello!");
    }
}
