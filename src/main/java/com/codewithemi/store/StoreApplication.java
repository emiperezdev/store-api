package com.codewithemi.store;

import com.codewithemi.store.entities.Category;
import com.codewithemi.store.entities.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StoreApplication.class, args);
		System.out.println(">>> OUTPUT <<<");

		var product = Product.builder()
			.price(1000.0)
			.name("Laptop")
			.build();

		var category = new Category("Electronics");

		product.addCategory(category.getName());
		System.out.println(category);
		System.out.println(product);
	}

}
