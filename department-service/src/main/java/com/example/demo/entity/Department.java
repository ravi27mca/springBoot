package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name="department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long departmentId;
	
	@JsonProperty("departmentName")
	@Column(name="DEPARTMENT_NAME")
	private String departmentName;
	
	@JsonProperty("departmentAddress")
	@Column(name="DEPARTMENT_ADDRESS")
	private String departmentAddress;
	
	@JsonProperty("departmentCode")
	@Column(name="DEPARTMENT_CODE")
	private String departmentCode;

}
