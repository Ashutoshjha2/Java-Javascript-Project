package com.book.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String bname;
	private String bprice;
	private String bauthor;
	private long bpage;
	private String uname;
	private long mobile;
	private String shipname;
	private long shipnumber;
	private String shipaddress;
	private String email;
	private String landmark;
	private String location;
	private int orderid;
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
	public String getBprice() {
		return bprice;
	}
	public void setBprice(String bprice) {
		this.bprice = bprice;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public long getBpage() {
		return bpage;
	}
	public void setBpage(long bpage) {
		this.bpage = bpage;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getShipname() {
		return shipname;
	}
	public void setShipname(String shipname) {
		this.shipname = shipname;
	}
	public long getShipnumber() {
		return shipnumber;
	}
	public void setShipnumber(long shipnumber) {
		this.shipnumber = shipnumber;
	}
	public String getShipaddress() {
		return shipaddress;
	}
	public void setShipaddress(String shipaddress) {
		this.shipaddress = shipaddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public OrderProduct(int bid, String bname, String bprice, String bauthor, long bpage, String uname, long mobile,
			String shipname, long shipnumber, String shipaddress, String email, String landmark, String location,
			int orderid) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
		this.bauthor = bauthor;
		this.bpage = bpage;
		this.uname = uname;
		this.mobile = mobile;
		this.shipname = shipname;
		this.shipnumber = shipnumber;
		this.shipaddress = shipaddress;
		this.email = email;
		this.landmark = landmark;
		this.location = location;
		this.orderid = orderid;
	}
	public OrderProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderProduct [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + ", bauthor=" + bauthor
				+ ", bpage=" + bpage + ", uname=" + uname + ", mobile=" + mobile + ", shipname=" + shipname
				+ ", shipnumber=" + shipnumber + ", shipaddress=" + shipaddress + ", email=" + email + ", landmark="
				+ landmark + ", location=" + location + ", orderid=" + orderid + "]";
	}
					
}
