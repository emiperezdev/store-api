package com.codewithemi.store.repositories;

import com.codewithemi.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address,Long> {
}
