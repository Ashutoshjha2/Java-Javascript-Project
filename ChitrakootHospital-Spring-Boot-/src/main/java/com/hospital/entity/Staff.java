package com.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int sid;
	private String staffusername;
	private String email;
	private String staffphone;
	private String staffaddress;
	private String password;
	private String staffstatus;
	private String adminstatus;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStaffusername() {
		return staffusername;
	}
	public void setStaffusername(String staffusername) {
		this.staffusername = staffusername;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStaffphone() {
		return staffphone;
	}
	public void setStaffphone(String staffphone) {
		this.staffphone = staffphone;
	}
	public String getStaffaddress() {
		return staffaddress;
	}
	public void setStaffaddress(String staffaddress) {
		this.staffaddress = staffaddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStaffstatus() {
		return staffstatus;
	}
	public void setStaffstatus(String staffstatus) {
		this.staffstatus = staffstatus;
	}
	public String getAdminstatus() {
		return adminstatus;
	}
	public void setAdminstatus(String adminstatus) {
		this.adminstatus = adminstatus;
	}
	
	public Staff( String staffusername, String email, String staffphone, String staffaddress, String password,
			String staffstatus, String adminstatus) {
		super();
		
		this.staffusername = staffusername;
		this.email = email;
		this.staffphone = staffphone;
		this.staffaddress = staffaddress;
		this.password = password;
		this.staffstatus = staffstatus;
		this.adminstatus = adminstatus;
	}
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Staff [sid=" + sid + ", staffusername=" + staffusername + ", email=" + email + ", staffphone="
				+ staffphone + ", staffaddress=" + staffaddress + ", password=" + password + ", staffstatus="
				+ staffstatus + ", adminstatus=" + adminstatus + "]";
	}
			
}
