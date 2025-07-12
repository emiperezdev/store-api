package com.codewithemi.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(nullable = false, name = "name")
  private String name;
  @Column(nullable = false, name = "email")
  private String email;
  @Column(nullable = false, name = "password")
  private String password;

  @OneToMany(mappedBy = "user")
  @Builder.Default
  private List<Address> addresses = new ArrayList<>();

  public void addAddress(Address address) {
    addresses.add(address);
    address.setUser(this);
  }
}
