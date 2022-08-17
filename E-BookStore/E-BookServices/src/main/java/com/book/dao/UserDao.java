package com.book.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.book.entity.Book;
import com.book.entity.Login;
import com.book.entity.OrderProduct;
import com.book.entity.Registration;

import javassist.bytecode.stackmap.BasicBlock.Catch;

public class UserDao {
	
	private SessionFactory factory;

	public UserDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	
	public List<OrderProduct>  getproduct(String email )
	{
		Session session = this.factory.openSession();
		Query query = session.createQuery("from OrderProduct as p where p.email=:email ");
		query.setParameter("email", email);
		List<OrderProduct> list = query.list();
	return list;
	
	}
	
	public List<OrderProduct>  getallproduct( )
	{
		Session session = this.factory.openSession();
		Query query = session.createQuery("from OrderProduct");
		List<OrderProduct> list = query.list();
		return list;
	}
	
	

}
