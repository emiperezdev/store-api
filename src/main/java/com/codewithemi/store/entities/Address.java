package com.codewithemi.store.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "addresses")
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "street")
  private String street;
  @Column(name = "city")
  private String city;
  @Column(name = "zip")
  private String zip;
  @Column(name = "state")
  private String state;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
}
