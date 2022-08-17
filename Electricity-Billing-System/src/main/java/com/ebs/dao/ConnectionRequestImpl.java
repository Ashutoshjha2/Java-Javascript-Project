package com.ebs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Random;

import com.ebs.entity.ConnectionDetails;
import com.ebs.entity.ConnectionRequests;

public class ConnectionRequestImpl implements ConnectionRequestDao {

	public void ConnectionRequest(ConnectionRequests connectionRequests) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/electricity-billing-system", "root", "root");
			PreparedStatement statement = connection
					.prepareStatement("insert into connectionrequest values (?,?,?,?,?,?,?,?)");
			statement.setInt(1, connectionRequests.getRegistrationId());
			statement.setString(2, connectionRequests.getfName());
			statement.setString(3, connectionRequests.getLname());
			statement.setString(4, connectionRequests.getAddress());
			statement.setString(5, connectionRequests.getEmail());
			statement.setInt(6, connectionRequests.getMobile());
			statement.setString(7, connectionRequests.getRequestStatus());
			statement.setString(8, connectionRequests.getRequestDate());
			int k = statement.executeUpdate();
			if (k > 0) {
				System.out.println("REQUEST SEND SUCCESSFULLY ....!!");

			} else {
				System.out.println("SOMETHING WENT WRONG....." + "IF ANY SUPPORT CALL ADMIN TEAM- 1234567890");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void ConnectionStatusUpdate(int registrationId) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/electricity-billing-system", "root", "root");
			String sql = "select * from connectionrequest where userregistrationid=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, registrationId);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				System.out.println("Please Wait....!!");
				Thread.sleep(2000);
				String sql1 = "update connectionrequest set requeststatus=? where userregistrationid=? ";
				PreparedStatement preparedStatement2 = connection.prepareStatement(sql1);
				preparedStatement2.setString(1, "ACCEPTED");
				preparedStatement2.setInt(2, registrationId);
				int k = preparedStatement2.executeUpdate();
				if (k > 0) {
					System.out.println("CREATING CONNECTION...!!");

					// account number creation
					Random random = new Random();
					int accountNumber = random.nextInt(99999999);

					int rid = resultSet.getInt(1);

					String fname = resultSet.getString(2);

					String lname = resultSet.getString(3);

					String email = resultSet.getString(5);

					String address = resultSet.getString(4);

					int mobile = resultSet.getInt(6);

					String connectiondate = new Date().toLocaleString();

					String requeststatus = resultSet.getString(7);

					// meter number creation
					Random random2 = new Random();
					int meternumber = random2.nextInt(999999);

					String meterstartdate = new Date().toLocaleString();

					ConnectionDetails connectionDetails = new ConnectionDetails();
					connectionDetails.setAccountNumber(accountNumber);
					connectionDetails.setAddress(address);
					connectionDetails.setConnectionDate(connectiondate);
					connectionDetails.setConnectionStatus("ACTIVE");
					connectionDetails.setEmail(email);
					connectionDetails.setFname(fname);
					connectionDetails.setLname(lname);
					connectionDetails.setMeterActiveDate(meterstartdate);
					connectionDetails.setMeterNumber(meternumber);
					connectionDetails.setMobile(mobile);
					connectionDetails.setRegistrationId(rid);
					// creating object CONNECTION DETAILS DAO IMPL
					ConnectionDetailsDaoImpl connectionDetailsDaoImpl = new ConnectionDetailsDaoImpl();
					connectionDetailsDaoImpl.AddConnectionDetails(connectionDetails);
					Thread.sleep(3000);
				} else {
					System.out.println("SOMETHING WENT WRONG...");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
