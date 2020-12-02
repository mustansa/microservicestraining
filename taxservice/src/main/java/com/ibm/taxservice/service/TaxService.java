package com.ibm.taxservice.service;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
	
	public Double tax(String name) {
		
		Double tax=0.0;
		if(name.equals("Apple")) {
			
			 tax=7.0;
			
		}else if(name.equals("Orange")) {
			 tax=8.0;
		}else {
			 tax=10.0;
		}
		
		return tax;
		
		
	}

}
