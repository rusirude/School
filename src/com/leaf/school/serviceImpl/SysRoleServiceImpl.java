package com.leaf.school.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leaf.school.dao.SysRoleDAO;
import com.leaf.school.dto.SysRoleDTO;
import com.leaf.school.service.SysRoleService;


@Service("sysRoleService")

public class SysRoleServiceImpl implements SysRoleService {
	
	@Autowired
	private SysRoleDAO sysRoleDAO;
	
	@Override
	@Transactional
	public List<SysRoleDTO> getAllRoles(){
		return sysRoleDAO.getAllRoles();
	}

}
