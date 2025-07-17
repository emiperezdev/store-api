package com.codewithemi.store.repositories;

import com.codewithemi.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
