package com.example.kino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.kino.model")
public class KinoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KinoApplication.class, args);
	}

}
