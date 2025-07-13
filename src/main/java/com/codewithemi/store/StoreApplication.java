package com.codewithemi.store;

import com.codewithemi.store.entities.Address;
import com.codewithemi.store.entities.Profile;
import com.codewithemi.store.entities.Tag;
import com.codewithemi.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StoreApplication.class, args);
		System.out.println(">>> OUTPUT <<<");
		var user = User.builder()
			.name("John")
			.password("Password1!")
			.email("john@gamil.com")
			.build();

		var profile = Profile.builder()
			.bio("bio")
			.build();

		user.addProfile(profile);
		System.out.println(user);
	}

}
