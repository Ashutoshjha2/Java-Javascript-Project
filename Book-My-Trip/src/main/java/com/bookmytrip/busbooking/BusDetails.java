package com.bookmytrip.busbooking;

import java.util.ArrayList;
import java.util.List;

public class BusDetails {
	
	private int bnumber;
	private String bName;
	private String bSourse;
	private String bDestination;
	private String bType;
	private int bPrice;
	
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
	public int getbPrice() {
		return bPrice;
	}
	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}
	public BusDetails(int bnumber, String bName, String bSourse, String bDestination, String bType, int bPrice) {
		super();
		this.bnumber = bnumber;
		this.bName = bName;
		this.bSourse = bSourse;
		this.bDestination = bDestination;
		this.bType = bType;
		this.bPrice = bPrice;
	}
	public BusDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BusDetails [bnumber=" + bnumber + ", bName=" + bName + ", bSourse=" + bSourse + ", bDestination="
				+ bDestination + ", bType=" + bType + ", bPrice=" + bPrice + "]";
	}
	
	//LIST OF BUSES
	  public static List<BusDetails> ShowAllBus(){
		  List<BusDetails> busDetails = new ArrayList<BusDetails>();
	      busDetails.add(new BusDetails(101, "VOLVO", "CHITRAKOOT", "BHOPAL", "AC", 2500));
	      busDetails.add(new BusDetails(201, "YELLOW", "CHITRAKOOT", "BHOPAL", "NON-AC", 1500));
	      busDetails.add(new BusDetails(102, "ORANGE", "CHITRAKOOT", "BIHAR", "AC", 1900));
	      busDetails.add(new BusDetails(202, "GOLD", "CHITRAKOOT", "BIHAR", "NON-AC", 900));
	      busDetails.add(new BusDetails(103, "STAR", "CHITRAKOOT", "PUNE", "AC", 1500));
	      busDetails.add(new BusDetails(104, "MOON", "CHITRAKOOT", "MUMBAI", "AC", 2500));
	      return busDetails;
	  }
	

}
