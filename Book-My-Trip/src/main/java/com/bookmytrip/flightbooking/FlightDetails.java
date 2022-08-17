package com.bookmytrip.flightbooking;

import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

public class FlightDetails {
	
	private int flightNumber;
	private String flightName;
	private String sourse;
	private String destination;
	private int price;
	private String stops;
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSourse() {
		return sourse;
	}
	public void setSourse(String sourse) {
		this.sourse = sourse;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStops() {
		return stops;
	}
	public void setStops(String stops) {
		this.stops = stops;
	}
	public FlightDetails(int flightNumber, String flightName, String sourse, String destination, int price,
			String stops) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.sourse = sourse;
		this.destination = destination;
		this.price = price;
		this.stops = stops;
	}
	public FlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FlightDetails [flightNumber=" + flightNumber + ", flightName=" + flightName + ", sourse=" + sourse
				+ ", destination=" + destination + ", price=" + price + ", stops=" + stops + "]";
	}
	
	
	public static List<FlightDetails> ALLFLIGHTS(){
		
		List<FlightDetails> flightDetails = new ArrayList<FlightDetails>();
		flightDetails.add(new FlightDetails(101, "SPACE-JET", "CHITRAKOOT", "BHOPAL", 4000, "NON-STOP") );
		flightDetails.add(new FlightDetails(102, "INDI-GO", "CHITRAKOOT", "BHOPAL", 5000, "2") );
		flightDetails.add(new FlightDetails(103, "KINGFISHER", "CHITRAKOOT", "BIHAR", 6000, "6") );
		flightDetails.add(new FlightDetails(104, "AIR-INDIA", "CHITRAKOOT", "PUNE", 2000, "8") );
		flightDetails.add(new FlightDetails(105, "AMERICA-AIRLINES", "CHITRAKOOT", "MUMBAI", 7000, "3") );
		
		return flightDetails;
		
		
	}

}
