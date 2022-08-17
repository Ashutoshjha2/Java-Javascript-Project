package com.book.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	@Id
	private int email;
	private long mobile;
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoginWithId [email=" + email + ", mobile=" + mobile + "]";
	}
	
	
}
