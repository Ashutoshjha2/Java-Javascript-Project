package com.hospital.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class AdmitPatient {
	@Id
	private int pid;
	private String pname;
	private String plname;
	private String pemail;
	private String pphone;
	private String page;
	private String gender;
	private String paddress;
	private String pcity;
	private String wardtype;
	private int wardno;
	private int bedno;
	private String admitstatus;
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
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
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
	public String getWardtype() {
		return wardtype;
	}
	public void setWardtype(String wardtype) {
		this.wardtype = wardtype;
	}
	public int getWardno() {
		return wardno;
	}
	public void setWardno(int wardno) {
		this.wardno = wardno;
	}
	public int getBedno() {
		return bedno;
	}
	public void setBedno(int bedno) {
		this.bedno = bedno;
	}
	public String getAdmitstatus() {
		return admitstatus;
	}
	public void setAdmitstatus(String admitstatus) {
		this.admitstatus = admitstatus;
	}
	public AdmitPatient(int pid, String pname, String plname, String pemail, String pphone, String page, String gender,
			String paddress, String pcity, String wardtype, int wardno, int bedno, String admitstatus) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plname = plname;
		this.pemail = pemail;
		this.pphone = pphone;
		this.page = page;
		this.gender = gender;
		this.paddress = paddress;
		this.pcity = pcity;
		this.wardtype = wardtype;
		this.wardno = wardno;
		this.bedno = bedno;
		this.admitstatus = admitstatus;
	}
	public AdmitPatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdmitPatient [pid=" + pid + ", pname=" + pname + ", plname=" + plname + ", pemail=" + pemail
				+ ", pphone=" + pphone + ", page=" + page + ", gender=" + gender + ", paddress=" + paddress + ", pcity="
				+ pcity + ", wardtype=" + wardtype + ", wardno=" + wardno + ", bedno=" + bedno + ", admitstatus="
				+ admitstatus + "]";
	}
		    
}
