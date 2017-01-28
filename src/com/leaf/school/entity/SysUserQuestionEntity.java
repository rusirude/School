package com.leaf.school.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user_question")
public class SysUserQuestionEntity extends BaseEntity{
	
	private static final long serialVersionUID = 3002301926704054590L;
	
	private SysUserQuestionEntityId id;
	private SysUserEntity sysUserEntity;
	private SecurityQuestionEntity questionEntity;
	private String answer;
	
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "username",column = @Column(name = "username", nullable = false)),
			@AttributeOverride(name = "questionId",column = @Column(name = "question_id", nullable = false))
		}
	)
	public SysUserQuestionEntityId getId() {
		return id;
	}
	public void setId(SysUserQuestionEntityId id) {
		this.id = id;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "username", referencedColumnName = "username", insertable = false, updatable = false)
	public SysUserEntity getSysUserEntity() {
		return sysUserEntity;
	}
	public void setSysUserEntity(SysUserEntity sysUserEntity) {
		this.sysUserEntity = sysUserEntity;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id", referencedColumnName = "id", insertable = false, updatable = false)
	public SecurityQuestionEntity getQuestionEntity() {
		return questionEntity;
	}
	public void setQuestionEntity(SecurityQuestionEntity questionEntity) {
		this.questionEntity = questionEntity;
	} 
	
	@Column(name = "answer", nullable = false)
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	

}
