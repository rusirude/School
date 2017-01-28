package com.leaf.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.leaf.school.dto.AjaxResponseDTO;
import com.leaf.school.service.SysUserService;

@Controller
public class ForgotPasswordController {
	
	@Autowired
	SysUserService sysUserService;
	
	@RequestMapping(value = "/forgotPassword",method = RequestMethod.GET)
	public String getForgotPassword(ModelMap model){
		return "ForgotPassword";
	}
	
	@RequestMapping(value = "/forgotPassword/checkUser/{username}",method = RequestMethod.GET)
	public String getUserByUsername(@PathVariable String username,ModelMap model){	 
		
		AjaxResponseDTO response = null;		
		response = sysUserService.checkUserAvailability(username);		
		model.addAttribute(response);
		return "ForgotPassword";
	}
	
	@RequestMapping(value = "/forgotPassword/getSecurityQuactions/{username}",method = RequestMethod.GET)
	public String getSecurityQuactionsForUser(@PathVariable String username,ModelMap model){	 
		
		AjaxResponseDTO response = null;		
		response = sysUserService.getSecurityQuactionsForUser(username);		
		model.addAttribute(response);
		return "ForgotPassword";
	}
	
	

}
