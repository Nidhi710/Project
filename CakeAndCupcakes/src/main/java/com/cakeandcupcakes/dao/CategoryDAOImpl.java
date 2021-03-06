package com.cakeandcupcakes.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cakeandcupcakes.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
	public CategoryDAOImpl() {

	}
	@Autowired
	private SessionFactory sessionFactory;


	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public List<Category> list() {
		
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listCategory;
	}
	public void saveOrUpdate(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}
	public void delete(String id) {
		Category CategoryToDelete = new Category();
		CategoryToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(CategoryToDelete);
	}


	
	public Category get(String id) {
		
		String hql = "from Category where id=" + "'"+ id +"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		List<Category> listCategory = (List<Category>) query.list();
		
		if (listCategory != null && !listCategory.isEmpty()) {
			return listCategory.get(0);
		}
		
		return null;
	}
	
	 public Category getByName(String name){

			String hql = "from Category where name=" + "'"+ name +"'";
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			
			List<Category> listCategory = (List<Category>) query.list();
			
			if (listCategory != null && !listCategory.isEmpty()) {
				return listCategory.get(0);
	 }
			return null;

	 }
}
