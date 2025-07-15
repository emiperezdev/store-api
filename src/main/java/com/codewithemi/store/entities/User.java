package com.codewithemi.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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

  @ManyToMany
  @JoinTable(
    name = "user_tags",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "tag_id")
  )
  @Builder.Default
  private Set<Tag> tags = new HashSet<>();

  @OneToOne(mappedBy = "user")
  private Profile profile;

  @ManyToMany
  @JoinTable(
    name = "wishlist",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "product_id")
  )
  private Set<Product> wishlist = new HashSet<>();

  public void addAddress(Address address) {
    addresses.add(address);
    address.setUser(this);
  }

  public void removeAddress(Address address) {
    addresses.remove(address);
    address.setUser(null);
  }

  public void addTag(String tagName) {
    var tag = new Tag(tagName);
    tags.add(tag);
    tag.getUsers().add(this);
  }

  public void removeTag(String tagName) {
    tags.stream()
      .filter(t -> t.getName().equals(tagName))
      .findFirst()
      .ifPresent(t -> tags.remove(t));
  }

  public void addProfile(Profile profile) {
    setProfile(profile);
    profile.setUser(this);
  }

  public void removeProfile(Profile profile) {
    setProfile(null);
    profile.setUser(null);
  }
}
