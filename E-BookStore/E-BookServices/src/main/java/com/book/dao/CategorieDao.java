package com.book.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.book.entity.Categories;

public class CategorieDao {
 
	private SessionFactory factory;

	public CategorieDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	
	public int saveCategory(Categories cat)
	{
		Session openSession = this.factory.openSession();
		Transaction tx = openSession.beginTransaction();
		Integer cateId =(Integer)openSession.save(cat);
		tx.commit();
		openSession.close();
		return cateId;
	}
	
	public List<Categories> getcategories()
	{
		Session session = this.factory.openSession();
		Query createQuery = session.createQuery("from Categories");
        List<Categories> list = createQuery.list();
        return list;
	}
	public Categories getCategoryById(int cid)
	{
		Categories categories = null;
		try {
			Session session = this.factory.openSession();
			 categories = session.get(Categories.class, cid);
			
			session.close();
		}catch (Exception e) {
		e.printStackTrace();
		}
		return categories;
	}
	
}
