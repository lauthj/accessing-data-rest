package com.example.accessingdatarest;

import org.springframework.beans.factory.annotation.Autowired;

public class Validate_data_rest {
	@Autowired
	Person person;
	
	void check() {
		
			System.out.println(person.getAge());
		
	}
}
