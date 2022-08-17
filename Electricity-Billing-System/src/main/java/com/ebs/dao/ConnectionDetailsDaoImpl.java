package com.ebs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ebs.entity.ConnectionDetails;

public class ConnectionDetailsDaoImpl implements ConnectionDetailsDao {

	public void AddConnectionDetails(ConnectionDetails connectionDetails) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/electricity-billing-system", "root", "root");
			String sql = "insert into connectiondetails values (?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, connectionDetails.getRegistrationId());
			preparedStatement.setInt(2, connectionDetails.getAccountNumber());
			preparedStatement.setString(3, connectionDetails.getFname());
			preparedStatement.setString(4, connectionDetails.getLname());
			preparedStatement.setString(5, connectionDetails.getEmail());
			preparedStatement.setString(6, connectionDetails.getAddress());
			preparedStatement.setInt(7, connectionDetails.getMobile());
			preparedStatement.setString(8, connectionDetails.getConnectionDate());
			preparedStatement.setString(9, connectionDetails.getConnectionStatus());
			preparedStatement.setInt(10, connectionDetails.getMeterNumber());
			preparedStatement.setString(11, connectionDetails.getMeterActiveDate());
     int k = preparedStatement.executeUpdate();
     if (k>0) {
		System.out.println("CONNECTION ACCPETED SUSSECCFULLY......");
	}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ShowAllActiveConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection1 = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/electricity-billing-system", "root", "root");
			String sql1 = "select * from connectiondetails";
			 Statement  statement = connection1.createStatement();
			 ResultSet resultSet1 = statement.executeQuery(sql1);
			while (resultSet1.next()) {
				System.err.println(
						"----------------------------------SHOW ALL ACTIVE CONNECTIONS -----------------------------------");
				System.out.printf(" %12s %15s %15s %18s %20s","ACCOUNT-NUMBER",
						"CONNECTION-DATE", "NAME", "METER-NUMBER", "ACCOUNT-STATUS");
				System.out.println();
				System.out.println(
						"---------------------------------------------------------------------------------------------");
				System.out.format(" %8s %16s %12s %18s %13s",
						resultSet1.getString(2), resultSet1.getString(8), resultSet1.getString(3),
						resultSet1.getString(10), resultSet1.getString(9));
				System.out.println();

				System.out.println(
						"----------------------------------------------------------------------------------------------");
			
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void ShowConnectionUserConnectionDetails(ConnectionDetails connectionDetails) {

try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection1 = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/electricity-billing-system", "root", "root");
	String sql1 = "select * from connectiondetails";
	 Statement  statement = connection1.createStatement();
	 ResultSet resultSet1 = statement.executeQuery(sql1);
	while (resultSet1.next()) {
		if (resultSet1.getInt(1)==connectionDetails.getRegistrationId()) {
			System.out.println("-------------------CONNECTION DETAILS--------------------");
			System.out.println("REGISTRATION-ID:" +resultSet1.getInt(1)+" , "+"ACCOUNT-NUMBER-:" +resultSet1.getInt(2)+"\n");
			System.out.println("FIRST-NAME-:" +resultSet1.getString(3)+" , "+"LAST-NAME-:" +resultSet1.getString(4)+"\n");
			System.out.println("EMAIL-:" +resultSet1.getString(5)+" , "+"ADDRESS-:" +resultSet1.getString(6)+"\n");
			System.out.println("MOBILE-:" +resultSet1.getInt(7)+" , "+"CONNECTION-DATE-:" +resultSet1.getString(8)+"\n");
			System.out.println("ACCOUNT-STATUS:" +resultSet1.getString(9)+" , "+"METER_NUMBER-:" +resultSet1.getString(10)+"\n");
			System.out.println("METER-START-DATE:" +resultSet1.getString(11));
		}
		
	}
	
	
} catch (Exception e) {
	e.printStackTrace();
}
		
	}


}
