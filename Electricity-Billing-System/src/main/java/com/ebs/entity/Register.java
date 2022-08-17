package com.ebs.entity;

public class Register {
	
	private int rId;
	private String firstname;
	private String lastName;
	private String email;
	private String address;
	private String password;
	private String accouttype;
	private int mobile;
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccouttype() {
		return accouttype;
	}
	public void setAccouttype(String accouttype) {
		this.accouttype = accouttype;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Register [rId=" + rId + ", firstname=" + firstname + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", password=" + password + ", accouttype=" + accouttype + ", mobile="
				+ mobile + "]";
	}
	

}
