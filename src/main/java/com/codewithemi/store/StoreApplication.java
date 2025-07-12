package com.codewithemi.store;

import com.codewithemi.store.entities.Address;
import com.codewithemi.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StoreApplication.class, args);
		var user = User.builder()
			.name("John")
			.password("Password1!")
			.email("john@gamil.com")
			.build();

		var address = Address.builder()
			.street("Wall Street")
			.city("Brooklyn")
			.state("LA")
			.zip("3000")
			.build();

		user.addAddress(address);
		System.out.println(user);

	}

}
