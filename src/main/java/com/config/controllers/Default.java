package com.config.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Default {
	
	@RequestMapping(value= {"/",""}, method=RequestMethod.GET)
	public String Hello() {
		return "Hello";
	}
	
}
