package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController



public class ValueAnnotation {

	@Value("This is subiksha")
	private String Sentence;
	
	@GetMapping("/")
	public String getMessage()
	{
		return Sentence;
	}
	
}
