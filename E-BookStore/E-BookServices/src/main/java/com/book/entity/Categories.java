package com.book.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cname;
	@OneToMany(mappedBy = "categories")
	private List<Book> Book = new ArrayList<Book>();
	public int getId() {
		return id;
	}
	public String getAname() {
		return cname;
	}
	public void setAname(String cname) {
		this.cname = cname;
	}
	public List<Book> getBook() {
		return Book;
	}
	public void setBook(List<Book> book) {
		Book = book;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Categories(int id, String cname, List<com.book.entity.Book> book) {
		super();
		this.id = id;
		this.cname = cname;
		Book = book;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", aname=" + cname + ", Book=" + Book + "]";
	}
	
}
