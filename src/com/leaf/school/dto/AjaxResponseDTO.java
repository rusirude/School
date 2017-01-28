package com.leaf.school.dto;

import java.io.Serializable;

public class AjaxResponseDTO implements Serializable{

	private static final long serialVersionUID = -10550238447776990L;
	
	private boolean isValid;
	private String errorMsg;
	private Object obj;
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
}
