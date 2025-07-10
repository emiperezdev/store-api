package com.codewithemi.store;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryUserRepository implements UserRepository {
  @Override
  public void save(User user) {
    System.out.println(">>>> IN MEMORY USER REPOSITORY <<<<");
    System.out.println("Saving user: " + user);
  }
}
