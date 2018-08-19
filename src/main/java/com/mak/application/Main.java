package com.mak.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class Main {

	@RequestMapping("/")
	public String getDefaultMessage() {
		return "Default message";
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
