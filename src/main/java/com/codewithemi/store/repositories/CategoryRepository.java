package com.codewithemi.store.repositories;

import com.codewithemi.store.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Byte> {
  }