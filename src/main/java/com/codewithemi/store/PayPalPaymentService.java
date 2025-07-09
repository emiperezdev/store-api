package com.codewithemi.store;

import org.springframework.stereotype.Service;

//@Service
public class PayPalPaymentService implements PaymentService {
  @Override
  public void processPayment(Double amount) {
    System.out.println(">>> PAYPAL SERVICE <<<");
    System.out.println("Amount: " + amount);
  }
}
