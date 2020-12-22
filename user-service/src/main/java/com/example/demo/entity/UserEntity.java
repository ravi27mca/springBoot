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
@NoArgsConstructor
@Data
@Table(name="user_entity")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long userID;
	
	@JsonProperty("firstName")
	@Column(name="FIRST_NAME")
	public String firstName;
	
	@JsonProperty("lastName")
	@Column(name="LAST_NAME")
	public String lastName;
	
	@JsonProperty("email")
	@Column(name="EMAIL")
	public String email;
	
	@JsonProperty("departmentId")
	@Column(name="DEPARTMENT_ID")
	public Long departmentId;
	

}
