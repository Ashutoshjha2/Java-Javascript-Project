package com.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class AmbulenceBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int bookingid;
	private String ambulencetype;
	private String uname;
	private String mobile;
	private String address;
	private String email;
	private String reffername;
	private String bookinground;
	private String paystatus;
	private String paytype;
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getAmbulencetype() {
		return ambulencetype;
	}
	public void setAmbulencetype(String ambulencetype) {
		this.ambulencetype = ambulencetype;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
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
	public String getReffername() {
		return reffername;
	}
	public void setReffername(String reffername) {
		this.reffername = reffername;
	}
	public String getBookinground() {
		return bookinground;
	}
	public void setBookinground(String bookinground) {
		this.bookinground = bookinground;
	}
	public String getPaystatus() {
		return paystatus;
	}
	public void setPaystatus(String paystatus) {
		this.paystatus = paystatus;
	}
	public String getPaytype() {
		return paytype;
	}
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	public AmbulenceBooking(String ambulencetype, String uname, String mobile, String address,
			String email, String reffername, String bookinground, String paystatus, String paytype) {
		super();
		
		this.ambulencetype = ambulencetype;
		this.uname = uname;
		this.mobile = mobile;
		this.address = address;
		this.email = email;
		this.reffername = reffername;
		this.bookinground = bookinground;
		this.paystatus = paystatus;
		this.paytype = paytype;
	}
	public AmbulenceBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AmbulenceBooking [bookingid=" + bookingid + ", ambulencetype=" + ambulencetype + ", uname=" + uname
				+ ", mobile=" + mobile + ", address=" + address + ", email=" + email + ", reffername=" + reffername
				+ ", bookinground=" + bookinground + ", paystatus=" + paystatus + ", paytype=" + paytype + "]";
	}

	
}
