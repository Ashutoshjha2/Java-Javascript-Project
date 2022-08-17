package com.book.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String bname;
	private String bpublisheddate;
	private int bpage;
	private long bmrp;
	private String written;
	private String bimg;
	private String pdf;
	@ManyToOne()
	private Categories categories;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBpublisheddate() {
		return bpublisheddate;
	}
	public void setBpublisheddate(String bpublisheddate) {
		this.bpublisheddate = bpublisheddate;
	}
	public int getBpage() {
		return bpage;
	}
	public void setBpage(int bpage) {
		this.bpage = bpage;
	}
	public long getBmrp() {
		return bmrp;
	}
	public void setBmrp(long bmrp) {
		this.bmrp = bmrp;
	}
	public String getWritten() {
		return written;
	}
	public void setWritten(String written) {
		this.written = written;
	}
	public String getBimg() {
		return bimg;
	}
	public void setBimg(String bimg) {
		this.bimg = bimg;
	}
	public String getPdf() {
		return pdf;
	}
	public void setPdf(String pdf) {
		this.pdf = pdf;
	}
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	public Book(int bid, String bname, String bpublisheddate, int bpage, long bmrp, String written, String bimg,
			String pdf, Categories categories) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bpublisheddate = bpublisheddate;
		this.bpage = bpage;
		this.bmrp = bmrp;
		this.written = written;
		this.bimg = bimg;
		this.pdf = pdf;
		this.categories = categories;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bpublisheddate=" + bpublisheddate + ", bpage=" + bpage
				+ ", bmrp=" + bmrp + ", written=" + written + ", bimg=" + bimg + ", pdf=" + pdf + ", categories="
				+ categories + "]";
	}
		
}
