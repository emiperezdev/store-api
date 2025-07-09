package com.codewithemi.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
//@Primary
public class StripePaymentService implements PaymentService {
  @Value("${stripe.apiUrl}")
  private String apiUrl;

  @Value("${stripe.enabled}")
  private boolean enabled;

  @Value("${stripe.timeout}")
  private int timeout;

  @Value("${stripe.supported-currencies}")
  private List<String> supportedCurrencies;

  @Override
  public void processPayment(Double amount) {
    System.out.println(">>> STRIPE SERVICE <<<");
    System.out.println("API URL: " + apiUrl);
    System.out.println("ENABLED: " + enabled);
    System.out.println("TIMEOUT: " + timeout);
    System.out.println("SUPPORTED CURRENCIES: " + supportedCurrencies);
    System.out.println("Amount: " + amount);
  }
}
