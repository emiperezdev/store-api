package com.codewithemi.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class StripePaymentService implements PaymentService {
  @Override
  public void processPayment(Double amount) {
    System.out.println(">>> STRIPE SERVICE <<<");
    System.out.println("Amount: " + amount);
  }
}
