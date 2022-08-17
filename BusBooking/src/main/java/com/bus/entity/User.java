package com.bus.entity;

public class User {
	private int id;
	private String username;
	private String pwd;
	private String fname;
	private String lname;
	private String address;
	private int phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public User(int id, String username, String pwd, String fname, String lname, String address, int phone) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.phone = phone;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", pwd=" + pwd + ", fname=" + fname + ", lname=" + lname
				+ ", address=" + address + ", phone=" + phone + "]";
	}

}
