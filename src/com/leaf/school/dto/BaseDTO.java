package com.leaf.school.dto;

import java.io.Serializable;
import java.util.Date;

public class BaseDTO implements Serializable{

	
	private static final long serialVersionUID = -8092344070071475948L;
	private String addedBy; 
	private Date addedOn;		
	private String updatedBy;
	private Date updatedOn;
	
	
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	public Date getAddedOn() {
		return addedOn;
	}
	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

}
