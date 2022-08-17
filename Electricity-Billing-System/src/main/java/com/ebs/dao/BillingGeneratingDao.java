package com.ebs.dao;

import com.ebs.entity.BillingGenerated;

public interface BillingGeneratingDao {
	
	//ADMIN
	public void GenerateBillByAccount(int accountnumber);
	//USER
	public void ShowBillByAccount(BillingGenerated billingGenerated);

}
