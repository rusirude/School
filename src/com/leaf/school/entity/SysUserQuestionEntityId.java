package com.leaf.school.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SysUserQuestionEntityId implements Serializable{

	private static final long serialVersionUID = 8807741909464898031L;

	private String username;
	private Integer questionId;
	
	@Column(name = "username", nullable = false)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name = "question_id", nullable = false)
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		result = prime
				* result
				+ ((questionId == null) ? 0 : questionId.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SysUserQuestionEntityId)) {
			return false;
		}
		SysUserQuestionEntityId other = (SysUserQuestionEntityId) obj;
		if (username == null) {
			if (other.username != null) {
				return false;
			}
		} 
		else if (!username.equals(other.username)) {
			return false;
		}
		if (questionId == null) {
			if (other.questionId != null) {
				return false;
			}
		} 
		else if (!questionId.equals(other.questionId)) {
			return false;
		}

		return true;
	}
}
