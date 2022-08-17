package com.idcard.entity;

public class RegisterOrLogin {
	private int registerID;
	private String userName;
	private String userPassword;
	private String userStatus;
	private String accountStatus;

	public int getRegisterID() {
		return registerID;
	}

	public void setRegisterID(int registerID) {
		this.registerID = registerID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public RegisterOrLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegisterOrLogin(int registerID, String userName, String userPassword, String userStatus,
			String accountStatus) {
		super();
		this.registerID = registerID;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userStatus = userStatus;
		this.accountStatus = accountStatus;
	}

	@Override
	public String toString() {
		return "RegisterOrLogin [registerID=" + registerID + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userStatus=" + userStatus + ", accountStatus=" + accountStatus + "]";
	}

}
