package com.leaf.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_management.sys_user")
public class SysUserEntity extends BaseEntity{
	
	private static final long serialVersionUID = 2448949396207074809L;
	
	private String username;
	private String password;
	private String name;
	private String isActive;
	private String firstLogin;
	
	
	@Id
	@Column(name = "username",nullable = false)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name = "password",nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "name",nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "is_active",nullable = false)
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	@Column(name = "first_login",nullable = false)
	public String getFirstLogin() {
		return firstLogin;
	}
	public void setFirstLogin(String firstLogin) {
		this.firstLogin = firstLogin;
	}

	
	

}
