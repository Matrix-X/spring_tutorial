package com.app.technoguru.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {
	
	@RequestMapping("/howareyou")
	public String getMood(){
		return "I am fantastic!";
	}
	
	@RequestMapping("/country")
	public List<Country> getCountries(){
	
		List<Country> oliCountry = new ArrayList<Country>();
		
		Country oCountry1 = new Country("1", "CN", "CHINA");
		
		Country oCountry2 = new Country("2", "US", "USA");
		
		oliCountry.add(oCountry1);
		oliCountry.add(oCountry2);
		
		return oliCountry;
		
		
	}
}
