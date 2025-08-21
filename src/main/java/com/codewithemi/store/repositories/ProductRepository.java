package com.codewithemi.store.repositories;

import com.codewithemi.store.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
  // Strings

  List<Product> findByName(String name);
  List<Product> findByNameLike(String name);
  List<Product> findByNameNotLike(String name);
  List<Product> findByNameContaining(String name);
  List<Product> findByNameStartingWith(String name);
  List<Product> findByNameEndingWith(String name);
  List<Product> findByNameEndingWithIgnoreCase(String name);

  // Numbers

  List<Product> findByPrice(Double price);
  List<Product> findByPriceGreaterThan(Double price);
  List<Product> findByPriceGreaterThanEqual(Double price);
  List<Product> findByPriceLessThan(Double price);
  List<Product> findByPriceBetween(Double min,  Double max);

  // Null
  List<Product> findByDescriptionNull();
  List<Product> findByDescriptionNotNull();

  // Multiple conditions
  List<Product> findByDescriptionNullAndNameNuLL();

  // Sort (OrderBy)
  List<Product> findByNameOrderByPrice(String name);

  // Limit (Top/First)
  List<Product> findTop5ByNameOrderByPriceDesc(String name);
  List<Product> findTop5ByNameLikeOrderByPriceDesc(String name);
}
