package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.VO.ResponseTempleteVO;
import com.example.demo.entity.UserEntity;
import com.example.demo.services.UserServices;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserServices userServices;
	
	
	@PostMapping("/")
	public UserEntity saveUser(@RequestBody UserEntity userEntity) {
		System.out.println("UserController:::saveUser:::");
		return userServices.saveUser(userEntity);		
	}
	
	@GetMapping("/{userId}")
	public ResponseTempleteVO getUserWithDepart(@PathVariable("userId") Long userId) {
		
		return userServices.getUserWithDepart(userId);		
		
	}
	
	
	

}
