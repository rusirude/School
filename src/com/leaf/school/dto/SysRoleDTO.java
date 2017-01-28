package com.leaf.school.dto;

public class SysRoleDTO extends BaseDTO{	

	
	private static final long serialVersionUID = 6888761888188005259L;
	private int id; 
	private String name;
	private String description; 

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
	
}
