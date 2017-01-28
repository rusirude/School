package com.leaf.school.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseEntity implements Serializable{	
	private static final long serialVersionUID = -1286660927076925572L;
	
	private String addedBy; 
	private Date addedOn;		
	private String updatedBy;
	private Date updatedOn;
	
	@Column(name = "added_by",nullable = false )
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "added_on", nullable = false)
	public Date getAddedOn() {
		return addedOn;
	}
	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}
	@Column(name = "updated_by", nullable = true)
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_on", nullable = true)
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	} 

}
