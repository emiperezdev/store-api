package com.codewithemi.store.services;

import com.codewithemi.store.entities.Address;
import com.codewithemi.store.entities.Category;
import com.codewithemi.store.entities.Product;
import com.codewithemi.store.entities.User;
import com.codewithemi.store.repositories.*;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@AllArgsConstructor
@Service
public class UserService {
  private final UserRepository userRepository;
  private final ProfileRepository profileRepository;
  private final EntityManager entityManager;
  private final AddressRepository addressRepository;
  private final ProductRepository productRepository;
  private final CategoryRepository categoryRepository;

  @Transactional
  public void showEntityStates() {
    var user = User.builder()
      .name("John Doe")
      .email("john@email.com")
      .password("password")
      .build();

    if (entityManager.contains(user))
      System.out.println("Persistent");
    else
      System.out.println("Transient / Detached");

    userRepository.save(user);

    if (entityManager.contains(user))
      System.out.println("Persistent");
    else
      System.out.println("Transient / Detached");
  }

  @Transactional
  public void showRelatedEntities() {
    var profile = profileRepository.findById(2L).orElseThrow();
    System.out.println(profile.getUser().getEmail());
  }

  public void fetchAddress() {
    var address = addressRepository.findById(1L).orElseThrow();
    System.out.println(address);
  }

  public void persistRelated() {
    var user = User.builder()
      .name("Michael")
      .password("password")
      .email("m@example.com")
      .build();

    var address = Address.builder()
      .zip("12345")
      .city("Berlin")
      .state("Berlin")
      .street("12345")
      .build();

    user.addAddress(address);

    userRepository.save(user);
  }

  @Transactional
  public void manageProducts() {
    productRepository.deleteById(4L);
  }

}
