package com.codewithemi.store.services;

import com.codewithemi.store.entities.User;
import com.codewithemi.store.repositories.ProfileRepository;
import com.codewithemi.store.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {
  private final UserRepository userRepository;
  private final ProfileRepository profileRepository;
  private final EntityManager entityManager;

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
}
