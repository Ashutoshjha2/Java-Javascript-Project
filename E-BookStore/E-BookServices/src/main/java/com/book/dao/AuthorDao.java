package com.book.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.book.entity.Registration;

public class AuthorDao {
	private SessionFactory factory;

	public AuthorDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	public List<Registration> getallauthor(String a)
	{
		Session session = this.factory.openSession();
	Query query = session.createQuery("from Registration as c where c.custstatus=: author");
	query.setParameter("author", a);
	List<Registration> list = query.list();
	return list;
	
	}
	

}
