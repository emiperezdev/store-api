package com.codewithemi.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailUserNotificationService implements NotificationUserService {
  @Value("${host}")
  private String host;

  @Value("${port}")
  private int port;

  @Override
  public void send(String message, String recipientEmail) {
    System.out.println(">>>> EMAIL USER NOTIFICATION SERVICE <<<<");
    System.out.println("Email sending to: " + recipientEmail);
    System.out.println("Message: " + message);
    System.out.println("Host: " + host);
    System.out.println("Port: " + port);
  }
}
