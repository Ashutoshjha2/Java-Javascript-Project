package com.book.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String uname;
	private long mobile;
	private String address;
	private String email;
	private String pass;
	private String adminstatus;
	private String custstatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAdminstatus() {
		return adminstatus;
	}
	public void setAdminstatus(String adminstatus) {
		this.adminstatus = adminstatus;
	}
	public String getCuststatus() {
		return custstatus;
	}
	public void setCuststatus(String custstatus) {
		this.custstatus = custstatus;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Registration(String uname, long mobile, String address, String email, String pass,
			String adminstatus, String custstatus) {
		super();
		this.id = id;
		this.uname = uname;
		this.mobile = mobile;
		this.address = address;
		this.email = email;
		this.pass = pass;
		this.adminstatus = adminstatus;
		this.custstatus = custstatus;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", uname=" + uname + ", mobile=" + mobile + ", address=" + address
				+ ", email=" + email + ", pass=" + pass + ", adminstatus=" + adminstatus + ", custstatus=" + custstatus
				+ "]";
	}
		
}
