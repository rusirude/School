package com.leaf.school.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.leaf.school.dao.BaseDAO;
import com.leaf.school.dao.SysUserDAO;
import com.leaf.school.dto.SecurityQuestionDTO;
import com.leaf.school.dto.SysUserDTO;
import com.leaf.school.entity.SysUserEntity;
import com.leaf.school.entity.SysUserQuestionEntity;
@Repository("SysUserDAO")
public class SysUserDAOImpl extends BaseDAO implements SysUserDAO{

	@Override
	public List<SysUserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<SysUserDTO> getUserByUsername(SysUserDTO user) throws Exception{
		List<SysUserDTO> users = null;
		String usrname = user.getUsername();
		Session session = getSession();
		Criteria criteria = session.createCriteria(SysUserEntity.class)
				.add(Restrictions.eq("username", usrname));
		Projection projection = Projections
				.projectionList()
				.add(Property.forName("username").as("username"))
				.add(Property.forName("name").as("name"))
				.add(Property.forName("isActive").as("isActive"))
				.add(Property.forName("firstLogin").as("firstLogin"))
				.add(Property.forName("addedBy").as("addedBy"))
				.add(Property.forName("addedOn").as("addedOn"))
				.add(Property.forName("updatedBy").as("updatedBy"))
				.add(Property.forName("updatedOn").as("updatedOn"));
		criteria.setProjection(projection);
		users = criteria.setResultTransformer(Transformers.aliasToBean(SysUserDTO.class)).list();
		return users;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<SecurityQuestionDTO> getSecurityQuactionByUsername(SysUserDTO user)throws Exception {
		List<SecurityQuestionDTO> questions = null;
		String username = user.getUsername();
		Session session = getSession();
		Criteria criteria = session.createCriteria(SysUserQuestionEntity.class)
			.add(Restrictions.eq("id.username",username))
			.createAlias("questionEntity", "questionEntity");
		Projection projection = Projections
				.projectionList()
				.add(Property.forName("id.questionId").as("id"))
				.add(Property.forName("questionEntity.question").as("question"));
		criteria.setProjection(projection);
		questions = criteria.setResultTransformer(Transformers.aliasToBean(SecurityQuestionDTO.class)).list();
		return questions;
	}
}
