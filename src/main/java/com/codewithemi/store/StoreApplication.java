package com.codewithemi.store;

import com.codewithemi.store.entities.Profile;
import com.codewithemi.store.entities.User;
import com.codewithemi.store.repositories.ProfileRepository;
import com.codewithemi.store.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//		var profileRepository = context.getBean(ProfileRepository.class);
		var userRepository = context.getBean(UserRepository.class);
		var user = User.builder()
			.name("John")
			.email("email")
			.password("password")
			.build();

		userRepository.save(user);
		System.out.println(user);
//
//		var profile = Profile.builder()
//			.bio("My bio")
//			.phoneNumber("123456789")
//			.loyaltyPoints(1000)
//			.build();
//
//		var user = userRepository.findById(1L).get();
//		user.addProfile(profile);
//		profileRepository.save(profile);
//
//		System.out.println(user);
	}

}
