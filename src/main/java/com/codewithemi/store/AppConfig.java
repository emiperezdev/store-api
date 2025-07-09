package com.codewithemi.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Value("${payment-gateway}")
  private String paymentGateway;

  @Bean
  public PaymentService stripe() {
    return new StripePaymentService();
  }

  @Bean
  public PaymentService payPal() {
    return new PayPalPaymentService();
  }

  @Bean
  public OrderService orderService() {
    return paymentGateway.equals("paypal") ?
      new OrderService(payPal()) :
      new OrderService(stripe());
  }
}
