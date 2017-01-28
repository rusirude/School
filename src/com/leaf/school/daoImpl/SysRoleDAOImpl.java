package com.leaf.school.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.leaf.school.dao.BaseDAO;
import com.leaf.school.dao.SysRoleDAO;
import com.leaf.school.dto.SysRoleDTO;
import com.leaf.school.entity.SysRoleEntity;


@Repository("sysRoleDAO")
public class SysRoleDAOImpl extends BaseDAO implements SysRoleDAO{
	@Override
	@SuppressWarnings("unchecked")
	public List<SysRoleDTO> getAllRoles() {		
		List<SysRoleDTO> sysRoles = null;
		Session session = getSession();
		Criteria criteria = session.createCriteria(SysRoleEntity.class);
		Projection projection = Projections
				.projectionList()
				.add(Property.forName("id").as("id"))
				.add(Property.forName("name").as("name"))
				.add(Property.forName("description").as("description"))
				.add(Property.forName("addedBy").as("addedBy"))
				.add(Property.forName("addedOn").as("addedOn"))
				.add(Property.forName("updatedBy").as("updatedBy"))
				.add(Property.forName("updatedOn").as("updatedOn"));
		
		criteria.setProjection(projection);		
		sysRoles = criteria.setResultTransformer(Transformers.aliasToBean(SysRoleDTO.class)).list();		
		return sysRoles;
	}

}
