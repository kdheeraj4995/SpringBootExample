package com.config.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class UserData {
	@Id
	@GeneratedValue
	private int userId;
	
	
	private String username;
	private String password;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Address address;
	
	public int getUserid() {
		return userId;
	}
	public void setUserid(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
