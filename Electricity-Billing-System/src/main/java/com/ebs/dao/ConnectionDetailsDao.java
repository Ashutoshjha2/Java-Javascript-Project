package com.ebs.dao;

import com.ebs.entity.ConnectionDetails;

public interface ConnectionDetailsDao {

	public void AddConnectionDetails(ConnectionDetails connectionDetails);
	public void ShowAllActiveConnection();
	public void ShowConnectionUserConnectionDetails(ConnectionDetails connectionDetails);
	
}
