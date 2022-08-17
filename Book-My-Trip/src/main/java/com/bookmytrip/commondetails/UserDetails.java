package com.bookmytrip.commondetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

public class UserDetails {

	private int PNR;
	private String uName;
	private String email;
	private String uSourse;
	private String uDestination;
	private String uDOJ;
	private String uDOB;
	private long uMobile;
	private int numberOfSeets;
	private String bookingStatus;
	private int bnumber;
	private String bName;
	private String bSourse;
	private String bDestination;
	private String bType;
	private double bPrice;
	List<Integer> seet = new ArrayList<Integer>();

	public List<Integer> getSeet() {
		return seet;
	}

	public void setSeet(List<Integer> seet) {
		this.seet = seet;
	}

	Map<Integer, UserDetails> map = new HashMap<Integer, UserDetails>();
	public List<UserDetails> list ;
	
	public void BookTrip(UserDetails userDetails) {
		list =  new ArrayList<UserDetails>();
		list.add(userDetails);
		//map.put(userDetails.getPNR(), userDetails); 
		System.out.println(" 1 Ticket Booking Successfully....\n " + userDetails);

	}

	public List<UserDetails> VIEWBOOKTICKET() {
		return list;
	}
	/*
	 * if (map.containsKey(id)) { return map.get(id); } return null; }
	 */

	public int getPNR() {
		return PNR;
	}

	public void setPNR(int pNR) {
		PNR = pNR;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getuSourse() {
		return uSourse;
	}

	public void setuSourse(String uSourse) {
		this.uSourse = uSourse;
	}

	public String getuDestination() {
		return uDestination;
	}

	public void setuDestination(String uDestination) {
		this.uDestination = uDestination;
	}

	public String getuDOJ() {
		return uDOJ;
	}

	public void setuDOJ(String uDOJ) {
		this.uDOJ = uDOJ;
	}

	public String getuDOB() {
		return uDOB;
	}

	public void setuDOB(String uDOB) {
		this.uDOB = uDOB;
	}

	public long getuMobile() {
		return uMobile;
	}

	public void setuMobile(long uMobile) {
		this.uMobile = uMobile;
	}

	public int getNumberOfSeets() {
		return numberOfSeets;
	}

	public void setNumberOfSeets(int numberOfSeets) {
		this.numberOfSeets = numberOfSeets;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getBnumber() {
		return bnumber;
	}

	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbSourse() {
		return bSourse;
	}

	public void setbSourse(String bSourse) {
		this.bSourse = bSourse;
	}

	public String getbDestination() {
		return bDestination;
	}

	public void setbDestination(String bDestination) {
		this.bDestination = bDestination;
	}

	public String getbType() {
		return bType;
	}

	public void setbType(String bType) {
		this.bType = bType;
	}

	public double getbPrice() {
		return bPrice;
	}

	public void setbPrice(double bPrice) {
		this.bPrice = bPrice;
	}

	public UserDetails(int pNR, String uName, String email, String uSourse, String uDestination, String uDOJ,
			String uDOB, long uMobile, int numberOfSeets, String bookingStatus, int bnumber, String bName,
			String bSourse, String bDestination, String bType, double bPrice) {
		super();
		PNR = pNR;
		this.uName = uName;
		this.email = email;
		this.uSourse = uSourse;
		this.uDestination = uDestination;
		this.uDOJ = uDOJ;
		this.uDOB = uDOB;
		this.uMobile = uMobile;
		this.numberOfSeets = numberOfSeets;
		this.bookingStatus = bookingStatus;
		this.bnumber = bnumber;
		this.bName = bName;
		this.bSourse = bSourse;
		this.bDestination = bDestination;
		this.bType = bType;
		this.bPrice = bPrice;
	}

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserDetails [PNR=" + PNR + ", uName=" + uName + ", email=" + email + ", uSourse=" + uSourse
				+ ", uDestination=" + uDestination + ", uDOJ=" + uDOJ + ", uDOB=" + uDOB + ", uMobile=" + uMobile
				+ ", numberOfSeets=" + numberOfSeets + ", bookingStatus=" + bookingStatus + ", bnumber=" + bnumber
				+ ", bName=" + bName + ", bSourse=" + bSourse + ", bDestination=" + bDestination + ", bType=" + bType
				+ ", bPrice=" + bPrice + "]";
	}

}
