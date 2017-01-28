package com.leaf.school.dao;

import java.util.List;

import com.leaf.school.dto.SecurityQuestionDTO;
import com.leaf.school.dto.SysUserDTO;

public interface SysUserDAO {
	
	public List<SysUserDTO> getAllUsers();
	public List<SysUserDTO> getUserByUsername(SysUserDTO user) throws Exception;
	public List<SecurityQuestionDTO> getSecurityQuactionByUsername(SysUserDTO user)throws Exception;
	
}
