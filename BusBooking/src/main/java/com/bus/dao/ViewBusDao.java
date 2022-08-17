package com.bus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bus.entity.BusDetails;

public class  ViewBusDao {

	public ArrayList<BusDetails> busdetails = new ArrayList<BusDetails>();

	public ArrayList<BusDetails> getBuses() {

		try {
			
			Connection con = ConnectionProvider.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from busdetails");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				//Creating Object for Bus
				BusDetails busDetails = new BusDetails();
				busDetails.setBus_no(rs.getInt(1));
				busDetails.setBus_name(rs.getString(2));
				busDetails.setDepTime(rs.getString(3));
				busDetails.setArrTime(rs.getString(4));
				busDetails.setToStation(rs.getString(5));
				busDetails.setFstation(rs.getString(6));
				busDetails.setSeat(rs.getInt(7));
				busDetails.setPrice(rs.getInt(8));
				//BUS ADD TO LIST
				busdetails.add(busDetails);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return busdetails;
	}
	

}
