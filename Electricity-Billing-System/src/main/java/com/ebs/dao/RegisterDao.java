package com.ebs.dao;

import com.ebs.entity.Register;

public interface RegisterDao {
	
	public void RegisterUser(Register register);
	public void LoginUser(int registrtionId,String password);

}
