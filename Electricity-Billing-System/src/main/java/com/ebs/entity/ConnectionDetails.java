package com.ebs.entity;

public class ConnectionDetails {
	private int registrationId;
	private int accountNumber;
	private String fname;
	private String lname;
	private String email;
	private String address;
	private int mobile;
	private String connectionDate;
	private String connectionStatus;
	private int meterNumber;
	private String meterActiveDate;

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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

	public String getConnectionDate() {
		return connectionDate;
	}

	public void setConnectionDate(String connectionDate) {
		this.connectionDate = connectionDate;
	}

	public String getConnectionStatus() {
		return connectionStatus;
	}

	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	public int getMeterNumber() {
		return meterNumber;
	}

	public void setMeterNumber(int meterNumber) {
		this.meterNumber = meterNumber;
	}

	public String getMeterActiveDate() {
		return meterActiveDate;
	}

	public void setMeterActiveDate(String meterActiveDate) {
		this.meterActiveDate = meterActiveDate;
	}

	public ConnectionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ConnectionDetails [registrationId=" + registrationId + ", accountNumber=" + accountNumber + ", fname="
				+ fname + ", lname=" + lname + ", email=" + email + ", address=" + address + ", mobile=" + mobile
				+ ", connectionDate=" + connectionDate + ", connectionStatus=" + connectionStatus + ", meterNumber="
				+ meterNumber + ", meterActiveDate=" + meterActiveDate + "]";
	}

}
