package com.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class RegisterPatient {
	@Id
	private int pid;
	private String pname;
	private String plname;
	private String pemail;
	private String pphone;
	private String pdob;
	private String gender;
	private String paddress;
	private String pcity;
	private String admitstatus;
	private String receptionname;
	private String receptionphone;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPlname() {
		return plname;
	}
	public void setPlname(String plname) {
		this.plname = plname;
	}
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	public String getPphone() {
		return pphone;
	}
	public void setPphone(String pphone) {
		this.pphone = pphone;
	}
	public String getPdob() {
		return pdob;
	}
	public void setPdob(String pdob) {
		this.pdob = pdob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getPcity() {
		return pcity;
	}
	public void setPcity(String pcity) {
		this.pcity = pcity;
	}
	public String getAdmitstatus() {
		return admitstatus;
	}
	public void setAdmitstatus(String admitstatus) {
		this.admitstatus = admitstatus;
	}
	public String getReceptionname() {
		return receptionname;
	}
	public void setReceptionname(String receptionname) {
		this.receptionname = receptionname;
	}
	public String getReceptionphone() {
		return receptionphone;
	}
	public void setReceptionphone(String receptionphone) {
		this.receptionphone = receptionphone;
	}
	public RegisterPatient(int pid, String pname, String plname, String pemail, String pphone, String pdob,
			String gender, String paddress, String pcity, String admitstatus, String receptionname,
			String receptionphone) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plname = plname;
		this.pemail = pemail;
		this.pphone = pphone;
		this.pdob = pdob;
		this.gender = gender;
		this.paddress = paddress;
		this.pcity = pcity;
		this.admitstatus = admitstatus;
		this.receptionname = receptionname;
		this.receptionphone = receptionphone;
	}
	public RegisterPatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RegisterPatient [pid=" + pid + ", pname=" + pname + ", plname=" + plname + ", pemail=" + pemail
				+ ", pphone=" + pphone + ", pdob=" + pdob + ", gender=" + gender + ", paddress=" + paddress + ", pcity="
				+ pcity + ", admitstatus=" + admitstatus + ", receptionname=" + receptionname + ", receptionphone="
				+ receptionphone + "]";
	}
		
}
