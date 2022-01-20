package com.ariel.noodle.noodle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
public class NoodleApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoodleApplication.class, args);
	}

	@GetMapping(value="/hello")
	public String getMethodName(@RequestParam(defaultValue = "World") String name) {
		return "hello " + name ;
	}
	

}
