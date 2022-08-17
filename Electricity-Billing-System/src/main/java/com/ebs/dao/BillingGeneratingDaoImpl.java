package com.ebs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

import com.ebs.entity.BillingGenerated;
import com.ebs.entity.NumberToWordConverter;

public class BillingGeneratingDaoImpl implements BillingGeneratingDao {

	public void ShowBillByAccount(int accountnumber) {

	}

	public void GenerateBillByAccount(int accountnumber) {
		try {
			Scanner s = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/electricity-billing-system", "root", "root");
			String sql = "select * from connectiondetails where accountnumber=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, accountnumber);

			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				System.out.println("ENTER THE METER READING VALUE");
				int meterReading = Integer.parseInt(s.nextLine());
				int meterPerunit = 6;
				int billamount = meterReading * meterPerunit;
				int dueDatebill = billamount + 50;
				String sql1 = "insert into generatebill values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement preparedStatement2 = connection.prepareStatement(sql1);
				preparedStatement2.setInt(1, resultSet.getInt(1));
				preparedStatement2.setInt(2, resultSet.getInt(2));
				preparedStatement2.setString(3, resultSet.getString(3));
				preparedStatement2.setString(4, resultSet.getString(5));
				preparedStatement2.setInt(5, resultSet.getInt(7));
				preparedStatement2.setString(6, resultSet.getString(8));
				preparedStatement2.setInt(7, resultSet.getInt(10));
				preparedStatement2.setString(8, resultSet.getString(11));
				preparedStatement2.setInt(9, meterReading);
				preparedStatement2.setInt(10, meterPerunit);
				preparedStatement2.setString(11, new Date().toLocaleString());
				preparedStatement2.setInt(12, billamount);
				preparedStatement2.setString(13, new Date().toLocaleString());
				preparedStatement2.setInt(14, dueDatebill);
				int k = preparedStatement2.executeUpdate();
				if (k > 0) {
					System.out.println("BILL GENERATE SUCCESSFULLY.....");
					System.out.println("ACCOUNT-NUMBER- : " + resultSet.getInt(2));
					System.out.println("TOTAL BILL- : " + billamount);
					System.out.println("LATE PAY BILL - : " + dueDatebill);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ShowBillByAccount(BillingGenerated billingGenerated) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection1 = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/electricity-billing-system", "root", "root");
			String sql1 = "select * from generatebill";
			 Statement  statement = connection1.createStatement();
			 ResultSet resultSet1 = statement.executeQuery(sql1);
			 while (resultSet1.next()) {
					if (resultSet1.getInt(1)==billingGenerated.getRid()) {
						System.out.println("-------------------BILL DETAILS MONTH OF -:" +resultSet1.getString(11)+"--------------------");
						System.out.println("REGISTRATION-ID:" +resultSet1.getInt(1)+" , "+"ACCOUNT-NUMBER-:" +resultSet1.getInt(2)+"\n");
						System.out.println("NAME-:" +resultSet1.getString(3)+" , "+"CONNECTION-DATE -:" +resultSet1.getString(6)+"\n");
						System.out.println("EMAIL-:" +resultSet1.getString(4)+" , "+"MOBILE-:" +resultSet1.getInt(5)+"\n");
						System.out.println("METER-READING-:" +resultSet1.getInt(9)+" , "+"PER-UNIT-PRICE RUPAYE -:" +resultSet1.getInt(10)+"\n");
						System.out.println("Bill-AMOUNT:" +resultSet1.getInt(12)+" "+"("+NumberToWordConverter.numberToWord(resultSet1.getInt(12))+")"+" , "+"BILL-DUE-DATE-:" +resultSet1.getString(13)+"\n");
						System.out.println("BILL-AFTER-DUE-DATE-AMOUNT-:" +resultSet1.getInt(14)+" "+"("+NumberToWordConverter.numberToWord(resultSet1.getInt(12))+")");
					}
					
				}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
