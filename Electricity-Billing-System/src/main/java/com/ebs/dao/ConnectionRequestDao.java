package com.ebs.dao;

import com.ebs.entity.ConnectionRequests;

public interface ConnectionRequestDao {

	public void ConnectionRequest(ConnectionRequests connectionRequests);
	public void ConnectionStatusUpdate(int registrationId);

}
