package com.ibm.taxservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.taxservice.service.TaxService;

@RequestMapping("tax")
@RefreshScope
@RestController
public class TaxController {
	
	@Autowired
	TaxService taxService;
	
	@Value("${message}")
	private String message;
	
	
	@GetMapping("/{name}")
	public Double tax(@PathVariable(value="name") String name) {
		
	return taxService.tax(name);
	}
	
	@GetMapping("/message")
	public String msg() {
		
		System.out.println("welcome to tax service");
		
		return this.message;
	}

}
