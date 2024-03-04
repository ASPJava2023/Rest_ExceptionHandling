package com.restException.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restException.Exception.UserNotFoundException;

@RestController
public class UserRestControler {

	@GetMapping("getuserName/{userId}")
	public String getuserName(@PathVariable("userId") Integer userId) throws Exception {
		if (userId == 101) {
			return "Johon";
		} else if (userId == 102) {
			return "Mohan";
		} else {
			throw new UserNotFoundException(" User Not found ");
		}
	}
}
