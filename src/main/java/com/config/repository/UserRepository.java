package com.config.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.config.models.UserData;

public interface UserRepository extends CrudRepository<UserData, Integer> {
	public List<UserData> findByAddressState(String state);
}
