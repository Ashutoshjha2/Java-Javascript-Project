package com.book.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.book.entity.Book;

public class BookDao {
	private SessionFactory factory;

	public BookDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	
	public boolean saveProduct(Book product)
	{
		boolean f = false;
		try {
			Session session = this.factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(product);
			tx.commit();
			session.close();
			  f=true;
			
		}catch (Exception e) {
			e.printStackTrace();
			f= false;
		}
		return f;
	}

	public List<Book> getAllProducts()
	{
		Session session = this.factory.openSession();
	Query query = session.createQuery("from Book");
	List<Book> list = query.list();
	return list;
	
	}
	
	// get products given product id
	public Book  getOneProduct(int pid )
	{
		Session session = this.factory.openSession();
		Book book = session.get(Book.class, pid);
//	Query query = session.createQuery("from Product as p where p.pid =: id");
//	Query book = query.setParameter("id", pid);
	return book ;
	
	}
	
	//get product given category id
	public List<Book> getAllProductById(int cid)
	{
		Session session = this.factory.openSession();
	Query query = session.createQuery("from Book as p where p.categories.id =: id");
	query.setParameter("id", cid);
	List<Book> list = query.list();
	return list;
	}
	
	public void deletebookById(int id)
	{
		Session session = this.factory.openSession();
		Query query = session.createQuery("delete from Book as b where b.bid=:bid");
		query.setParameter("bid", id);
	}
}
