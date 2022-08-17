package com.bus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bus.entity.BusDetails;

public class AddBusDao {

	static int k;
	
	public  static int insertBus(BusDetails bd ){
		
		try {
			Connection con =ConnectionProvider.getConnection();
			String insertQ = "insert into busdetails values(?,?,?,?,?,?,?,?)";
			PreparedStatement pstm = con.prepareStatement(insertQ);
			pstm.setInt(1,bd.getBus_no());
			pstm.setString(2,bd.getBus_name());
			pstm.setString(3,bd.getDepTime());
			pstm.setString(4,bd.getArrTime());
			pstm.setString(5,bd.getToStation());
			pstm.setString(6,bd.getFstation());
			pstm.setInt(7,bd.getSeat());
			pstm.setInt(8,bd.getPrice());
			
			k =pstm.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
