package com.springsulimann.springsulimann;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringSulimannApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSulimannApplication.class, args);
	}

}
