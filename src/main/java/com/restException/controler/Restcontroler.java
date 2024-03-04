package com.restException.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroler {

	@GetMapping("/welcome")
	public String welcome() {
		int i = 30 / 0;
		return "Welcome to Exception handling Project";
	}

}
