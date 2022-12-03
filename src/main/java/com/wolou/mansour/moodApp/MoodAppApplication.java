package com.wolou.mansour.moodApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoodAppApplication {

	public static void main(String[] args) {
		System.out.println("working");
		SpringApplication.run(MoodAppApplication.class, args);
	}

	@GetMapping
	public String getHello(){
		return "n'abandonne pas ";
	}

}

