package com.config.repository;

import org.springframework.data.repository.CrudRepository;

import com.config.models.UserData;

public interface UserRepository extends CrudRepository<UserData, Integer> {

}
