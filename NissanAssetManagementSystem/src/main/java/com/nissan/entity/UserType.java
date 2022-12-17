package com.nissan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tblUserType")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	private Integer ut_id;
	
	private String userType;

	public UserType(String userType) {
		this.userType = userType;
	}

	//default Constructor
	public UserType() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterised Constructor
	public UserType(Integer ut_id, String userType) {
		super();
		this.ut_id = ut_id;
		this.userType = userType;
	}

	//getters and setters
	public Integer getUt_id() {
		return ut_id;
	}

	public void setUt_id(Integer ut_id) {
		this.ut_id = ut_id;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	
	
}
