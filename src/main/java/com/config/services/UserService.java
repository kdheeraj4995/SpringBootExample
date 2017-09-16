package com.config.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.config.models.UserData;
import com.config.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<UserData> getAllUsers() {
		List<UserData> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	public void addUser(UserData user) {
		userRepository.save(user);
	}
	
	public void modifyUser(UserData user) {
		userRepository.save(user);
	}
	
	public void deleteUser(UserData user){
		userRepository.delete(user);
	}
}
