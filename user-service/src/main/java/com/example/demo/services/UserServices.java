package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.VO.Department;
import com.example.demo.VO.ResponseTempleteVO;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServices {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;

	public UserEntity saveUser(UserEntity userEntity) {
		System.out.println("UserServices:::saveUser"+userEntity.getUserID());
		System.out.println("UserServices:::saveUser"+userEntity.getEmail());
		System.out.println("UserServices:::saveUser"+userEntity.getFirstName());
		System.out.println("UserServices:::saveUser"+userEntity.getLastName());
		System.out.println("UserServices:::saveUser"+userEntity.getDepartmentId());
		return repository.save(userEntity);
		
	}

	public ResponseTempleteVO getUserWithDepart(Long userId) {
		System.out.println("UserServices:::getUserWithDepart");
		ResponseTempleteVO responseTempleteVO = new ResponseTempleteVO();
		
		UserEntity userEntity = repository.findByUserID(userId);
		if(userEntity != null) {
			Department department = restTemplate.getForObject("http://localhost:9010/department/"+userEntity.getDepartmentId().toString(), Department.class);
			responseTempleteVO.setDepartment(department);
			responseTempleteVO.setUserEntity(userEntity);
		}
		
		return responseTempleteVO;
	}

}
