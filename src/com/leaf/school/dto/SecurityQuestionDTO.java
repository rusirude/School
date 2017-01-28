package com.leaf.school.dto;

public class SecurityQuestionDTO extends BaseDTO{
	

	private static final long serialVersionUID = -374634523171291220L;
	
	private int id;
	private String question;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	

}
