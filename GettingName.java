

package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@RestController



public class GettingName
{
	@GetMapping(value="/name/{name}")
	public String getName(@PathVariable String name)
	{
		return "HELLOOOO"+" "+name;
	}
}


