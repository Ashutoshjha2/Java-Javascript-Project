package com.idcard.entity;

public class ID_CARD_Details {
	private int idCardNo;
	private int empId;
	private String empName;
	private String empDept;
	private String dateOfJoning;
	private String issueDatecard;
	private int mobile;
	private String address;
	private String bloodgroup;
	private int age;
	public int getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(int idCardNo) {
		this.idCardNo = idCardNo;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getDateOfJoning() {
		return dateOfJoning;
	}
	public void setDateOfJoning(String dateOfJoning) {
		this.dateOfJoning = dateOfJoning;
	}
	public String getIssueDatecard() {
		return issueDatecard;
	}
	public void setIssueDatecard(String issueDatecard) {
		this.issueDatecard = issueDatecard;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "ID_CARD_Details [idCardNo=" + idCardNo + ", empId=" + empId + ", empName=" + empName + ", empDept="
				+ empDept + ", dateOfJoning=" + dateOfJoning + ", issueDatecard=" + issueDatecard + ", mobile=" + mobile
				+ ", address=" + address + ", bloodgroup=" + bloodgroup + ", age=" + age + "]";
	}
	public ID_CARD_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
