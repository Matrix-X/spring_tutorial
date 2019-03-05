package com.app.technoguru.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {
	
	@RequestMapping("/howareyou")
	public String getMood(){
		return "I am fantastic!";
	}
}
