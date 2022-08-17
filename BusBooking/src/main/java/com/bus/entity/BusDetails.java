package com.bus.entity;

public class BusDetails {
	private int bus_no;
	private String  bus_name;
	private String  depTime;
	private String arrTime;
	private String toStation;
	private String fstation;
	private int seat;
	private int price;
	
	
	public int getBus_no() {
		return bus_no;
	}
	public void setBus_no(int bus_no) {
		this.bus_no = bus_no;
	}
	public String getBus_name() {
		return bus_name;
	}
	public void setBus_name(String bus_name) {
		this.bus_name = bus_name;
	}
	public String getDepTime() {
		return depTime;
	}
	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}
	public String getArrTime() {
		return arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}
	public String getToStation() {
		return toStation;
	}
	public void setToStation(String toStation) {
		this.toStation = toStation;
	}
	public String getFstation() {
		return fstation;
	}
	public void setFstation(String fstation) {
		this.fstation = fstation;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public BusDetails(int bus_no, String bus_name, String depTime, String arrTime, String toStation, String fstation,
			int seat, int price) {
		super();
		this.bus_no = bus_no;
		this.bus_name = bus_name;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.toStation = toStation;
		this.fstation = fstation;
		this.seat = seat;
		this.price = price;
	}
	public BusDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BusDetails [bus_no=" + bus_no + ", bus_name=" + bus_name + ", depTime=" + depTime + ", arrTime="
				+ arrTime + ", toStation=" + toStation + ", fstation=" + fstation + ", seat=" + seat + ", price="
				+ price + "]";
	}
	
	

}
