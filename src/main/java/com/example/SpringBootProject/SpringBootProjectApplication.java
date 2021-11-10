package com.example.SpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

	@PostMapping("/hello")
	public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name,@RequestParam(value = "myId", defaultValue = "1") int id) {
		return String.format("Hello %1$s!  %2$d!", name,id);
	}
}
/*The sayHello() method takes the name parameter and returns the word Hello combined with the parameter value. Everything else is handled by adding Spring annotations:
The @RestController annotation marks the SpringBootTutorialApplication class as a request handler (a REST controller).
The @GetMapping("/hello") annotation maps the sayHello() method to GET requests for /hello.

@PostMapping("/hello")
	public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

The @RequestParam annotation maps the name method parameter to the myName web request parameter. If you don't provide the myName parameter in your web request, it will default to World.*/