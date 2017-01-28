package com.leaf.school.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leaf.school.dao.SecurityQuestionDAO;
import com.leaf.school.dto.SecurityQuestionDTO;
import com.leaf.school.service.SecurityQuestionService;

@Service("SecurityQuestionService")
public class SecurityQuestionServiceImpl implements SecurityQuestionService{
	
	@Autowired 
	SecurityQuestionDAO securityQuestionDAO;

	@Override
	@Transactional
	public List<SecurityQuestionDTO> getAllSecurityQuestions() {		
		return securityQuestionDAO.getAllSecurityQuestions();
	}
	

}
