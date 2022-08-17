package com.idcard.entity.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.idcard.entity.ID_CARD_Details;

public class IID_CARD_DetailsImpl implements IID_CARD_Details {

	public void GeneratorID_Card(ID_CARD_Details id_CARD_Details) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/idcardgenerator", "root",
					"root");
			PreparedStatement statement = connection.prepareStatement("insert into idcarddetails values (?,?,?,?,?,?,?,?,?,?)");
			statement.setInt(1, id_CARD_Details.getIdCardNo());
			statement.setInt(2, id_CARD_Details.getEmpId());
			statement.setString(3, id_CARD_Details.getEmpName());
			statement.setString(4, id_CARD_Details.getEmpDept());
			statement.setString(5, id_CARD_Details.getDateOfJoning());
			statement.setString(6, id_CARD_Details.getIssueDatecard());
			statement.setInt(7,id_CARD_Details.getMobile());
			statement.setString(8, id_CARD_Details.getAddress());
			statement.setString(9, id_CARD_Details.getBloodgroup());
			statement.setInt(10, id_CARD_Details.getAge());
			int k = statement.executeUpdate();
			if (k>0) {
				System.out.println("ONE ID-CARD GENERATED.....");
			}else {
				System.out.println("SOMETHING WENT WRONG....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void SHOWAllID_CARD() {
		// TODO Auto-generated method stub
		
	}

}
