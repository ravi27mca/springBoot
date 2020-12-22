package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.services.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	
	
	@PostMapping( path = "/" )
	public Department saveDepartment(@RequestBody Department department) {
		System.out.println("DepartmentController:::saveDepartment");
		System.out.println("DepartmentController:::department:::"+department.toString());
		System.out.println("DepartmentController:::department:::");
		System.out.println("DepartmentController:::department:::");
		return departmentService.saveDepartment(department);
		
	}
	
	
	@GetMapping("/{departmentId}")
	public Department fineDepartmentById(@PathVariable Long departmentId) {
		System.out.println("DepartmentController:::fineDepartmentById");
		return departmentService.findByDepartmentId(departmentId);		
	}

}
