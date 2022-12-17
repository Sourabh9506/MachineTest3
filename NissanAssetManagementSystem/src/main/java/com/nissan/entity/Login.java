package com.nissan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tblLogin")
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	private Integer l_id;
	
	private String username;
	
	private String password;
	
	private Integer ut_id;
	
	@ManyToOne
	@JoinColumn(name = "ut_id", insertable = false, updatable = false)
	private UserType userType;
	
	@OneToOne(mappedBy = "login")
	@JsonIgnore
	private UserRegistration userRegistration;
	
 
	
	
	//default constructor
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterised constructor
	public Login(Integer l_id, String username, String password, Integer ut_id, UserType userType,
			UserRegistration userRegistration) {
		super();
		this.l_id = l_id;
		this.username = username;
		this.password = password;
		this.ut_id = ut_id;
		this.userType = userType;
		this.userRegistration = userRegistration;
	}


	//getters and setters
	public Integer getL_id() {
		return l_id;
	}

	public void setL_id(Integer l_id) {
		this.l_id = l_id;
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

	public Integer getUt_id() {
		return ut_id;
	}

	public void setUt_id(Integer ut_id) {
		this.ut_id = ut_id;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public UserRegistration getUserRegistration() {
		return userRegistration;
	}

	public void setUserRegistration(UserRegistration userRegistration) {
		this.userRegistration = userRegistration;
	}

	//toString
	@Override
	public String toString() {
		return "Login [l_id=" + l_id + ", username=" + username + ", password=" + password + ", ut_id=" + ut_id
				+ ", userType=" + userType + ", userRegistration=" + userRegistration + "]";
	}
	
	
	
}
