package com.codewithemi.store.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "price")
  private Double price;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private Category category;

  public void addCategory(String categoryName) {
    var category = new Category(categoryName);
    setCategory(category);
    category.getProducts().add(this);
  }
}
