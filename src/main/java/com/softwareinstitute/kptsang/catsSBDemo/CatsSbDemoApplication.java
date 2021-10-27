package com.softwareinstitute.kptsang.catsSBDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CatsSbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatsSbDemoApplication.class, args);
	}

	@GetMapping("/getcat")
	public String catResponse() {
		Cat cat = new Cat("Tiddles", 7, "manx");
	return cat.getJsonObjectOfCat();
	}

	@GetMapping("/getdog")
	public String dogResponse(){
		Dog dog = new Dog("Satchmo", 1, "very friendly");
		return dog.getJsonObjectOfDog();
	}

}
