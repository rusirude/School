package com.leaf.school.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leaf.school.dao.SysUserDAO;
import com.leaf.school.dto.AjaxResponseDTO;
import com.leaf.school.dto.SecurityQuestionDTO;
import com.leaf.school.dto.SysUserDTO;
import com.leaf.school.service.SysUserService;

@Service("sysUsereService")
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	SysUserDAO sysUserDAO;
	
	@Override
	public List<SysUserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public AjaxResponseDTO checkUserAvailability(String username) {
		AjaxResponseDTO response = null;
		SysUserDTO user = new SysUserDTO();
		List<SysUserDTO> users = null;
		user.setUsername(username);
		try{
			/*-1 for server Error,
			 * 0 for not found,
			 * 1 For only one user found
			 * 2,3... multiple user fond (2,3,..number of users)*/
			users = sysUserDAO.getUserByUsername(user);
			
			response = new AjaxResponseDTO();
			response.setErrorMsg("Success");
			response.setObj(new Integer(users.size()));
			response.setValid(true);
		}
		catch(Exception e){
			response = new AjaxResponseDTO();
			response.setErrorMsg("Server Error");
			response.setObj(new Integer(-1));
			response.setValid(false);
			e.printStackTrace();
		}
		
		return response;
	}
	
	@Override
	@Transactional
	public AjaxResponseDTO getSecurityQuactionsForUser(String username){
		AjaxResponseDTO response = null;
		SysUserDTO user = new SysUserDTO();
		List<SecurityQuestionDTO> questions = null;
		user.setUsername(username);		
		try{
			questions = sysUserDAO.getSecurityQuactionByUsername(user);
			response = new AjaxResponseDTO();
			response.setErrorMsg("Success");
			response.setObj(questions);
			response.setValid(true);
		}
		catch(Exception e){
			response = new AjaxResponseDTO();
			response.setErrorMsg("Server Error");			
			response.setValid(false);
			e.printStackTrace();
		}
		return response;
	}

}
