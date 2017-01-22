package com.leaf.school.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.leaf.school.dto.AjaxResponseDTO;
import com.leaf.school.service.SysRoleService;
import com.leaf.school.service.SysUserService;

@Controller
public class InitController {
	
	@Autowired
	SysRoleService sysRoleService;
	@Autowired
	SysUserService sysUsereService;
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String getInit(ModelMap model){	
		return "Welcome";
	}
	@RequestMapping(value="/welcome",method = RequestMethod.GET)
	public String getWelcome(ModelMap model){	
		AjaxResponseDTO response = null;
		response = sysUsereService.getSecurityQuactionsForUser("admin");
		model.addAttribute(response);
		return "Welcome";
	}

}
