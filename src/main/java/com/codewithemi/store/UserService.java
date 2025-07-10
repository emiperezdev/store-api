package com.codewithemi.store;

import org.springframework.stereotype.Service;

@Service
public class UserService {
  private UserRepository userRepository;
  private NotificationUserService notificationUserService;

  public UserService(UserRepository userRepository, NotificationUserService notificationUserService) {
    this.userRepository = userRepository;
    this.notificationUserService = notificationUserService;
  }

  public void registerUser(User user) {
    userRepository.save(user);
    notificationUserService.send("Hello there :>", user.getEmail());
  }
}
