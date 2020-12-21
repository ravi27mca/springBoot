package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.LoginUser;
import com.example.demo.repository.UserRepository;

public class LoginController {
	
	@Autowired
	public UserRepository repository;
	
	public void getLogin() {
		System.out.println("LoginController----------");
		try {
			repository.findByUsername("ravi");
			//LoginUser user = (LoginUser)repository.findByName("ravi");
			LoginUser user = new LoginUser();
			user.setId(2);
			user.setUsername("ravi1");
			user.setPassword("ravi1");
			repository.save(user);
			
			repository.findAll();
			
		} catch (Exception e) {
			System.out.println("not found");
			e.printStackTrace();
		}
		
	}

}
