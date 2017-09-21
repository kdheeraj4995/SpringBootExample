package com.config.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.config.models.UserData;
import com.config.services.UserService;

@RestController
public class Default {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/register", method=RequestMethod.POST , consumes = "application/json")
	public void register(@RequestBody UserData user) {
		userService.addUser(user);
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<UserData> getUsers() {
		return   userService.getAllUsers();
	}
	
}
