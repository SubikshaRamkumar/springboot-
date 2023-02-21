package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@RestController

public class FavColor{

	@RequestMapping(value="/MyFav/{color}",method=RequestMethod.GET)
	public String getMyFavColor(@PathVariable String color)
	{
		return "MyFavorite Color is "+color;
	}
	
}