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
import com.leaf.school.dao.SecurityQuestionDAO;
import com.leaf.school.dto.SecurityQuestionDTO;
import com.leaf.school.entity.SecurityQuestionEntity;


@Repository("SecurityQuestionDAO")
public class SecurityQuestionDAOImpl extends BaseDAO implements SecurityQuestionDAO{
	@Override
    @SuppressWarnings("unchecked")
	public List<SecurityQuestionDTO> getAllSecurityQuestions() {
    	List<SecurityQuestionDTO> securityQuestionDTO = null;
    	Session session = getSession();
    	Criteria criteria = session.createCriteria(SecurityQuestionEntity.class);
    	Projection projection = Projections
    			.projectionList()
    			.add(Property.forName("id").as("id"))
    			.add(Property.forName("question").as("question"))
    			.add(Property.forName("addedBy").as("addedBy"))
				.add(Property.forName("addedOn").as("addedOn"))
				.add(Property.forName("updatedBy").as("updatedBy"))
				.add(Property.forName("updatedOn").as("updatedOn"));
    	criteria.setProjection(projection);
    	securityQuestionDTO = criteria.setResultTransformer(Transformers.aliasToBean(SecurityQuestionDTO.class)).list();
		
		return securityQuestionDTO;
	}

}
