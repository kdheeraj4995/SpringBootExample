package com.config.repository;

import org.springframework.data.repository.CrudRepository;

import com.config.models.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
