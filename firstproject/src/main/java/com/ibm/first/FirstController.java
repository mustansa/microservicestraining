package com.ibm.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/simple")
	public String message() {
		return "welcome to Spring boot";
	}

}
