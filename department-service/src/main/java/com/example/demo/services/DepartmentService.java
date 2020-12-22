package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	public DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public Department findByDepartmentId(Long departmentId) {	
		System.out.println("departmentId:::"+departmentId);
		return departmentRepository.findByDepartmentId(departmentId);
	
	}

}
