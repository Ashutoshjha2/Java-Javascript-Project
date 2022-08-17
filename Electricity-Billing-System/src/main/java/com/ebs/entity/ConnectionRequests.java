package com.ebs.entity;

public class ConnectionRequests {
	private int registrationId;
	private String fName;
	private String lname;
	private String email;
	private String address;
	private int mobile;
	private String requestDate;
	private String  requestStatus;
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}
	public String getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
	public ConnectionRequests() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ConnectionRequests [registrationId=" + registrationId + ", fName=" + fName + ", lname=" + lname
				+ ", email=" + email + ", address=" + address + ", mobile=" + mobile + ", requestDate=" + requestDate
				+ ", requestStatus=" + requestStatus + "]";
	}
	

}
