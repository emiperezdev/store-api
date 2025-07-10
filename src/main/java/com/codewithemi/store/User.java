package com.codewithemi.store;

public class User {
  private long id;

  private String email;
  private String password;
  private String name;

  public User(long id, String email, String password, String name) {
    this.id = id;
    this.email = email;
    this.password = password;
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", email='" + email + '\'' +
      ", password='" + password + '\'' +
      ", name='" + name + '\'' +
      '}';
  }

  public String getEmail() {
    return email;
  }
}
