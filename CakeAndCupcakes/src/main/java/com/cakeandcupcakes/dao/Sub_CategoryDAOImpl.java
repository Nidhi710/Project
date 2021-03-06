package com.cakeandcupcakes.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.cakeandcupcakes.model.Sub_Category;

@Repository
public class Sub_CategoryDAOImpl implements Sub_CategoryDAO {
	public Sub_CategoryDAOImpl() {

	}
	@Autowired
	private SessionFactory sessionFactory;


	public Sub_CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public List<Sub_Category> list() {
		
		@SuppressWarnings("unchecked")
		List<Sub_Category> listSub_Category = (List<Sub_Category>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Sub_Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listSub_Category;
	}
	public void saveOrUpdate(Sub_Category sub_category) {
		sessionFactory.getCurrentSession().saveOrUpdate(sub_category);
	}
	public void delete(String id) {
		Sub_Category Sub_CategoryToDelete = new Sub_Category();
		Sub_CategoryToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(Sub_CategoryToDelete);
	}


	
	public Sub_Category get(String id) {
		
		String hql = "from Sub_Category where id=" + "'"+ id +"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		List<Sub_Category> listSub_Category = (List<Sub_Category>) query.list();
		
		if (listSub_Category != null && !listSub_Category.isEmpty()) {
			return listSub_Category.get(0);
		}
		
		return null;
	}
	
	
public Sub_Category getByName(String name) {
		
		String hql = "from Sub_Category where name=" + "'"+ name +"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		List<Sub_Category> listSub_Category = (List<Sub_Category>) query.list();
		
		if (listSub_Category != null && !listSub_Category.isEmpty()) {
			return listSub_Category.get(0);
		}
		
		return null;
	}
	
	

}