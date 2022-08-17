package com.idcard.entity.dao;

import com.idcard.entity.RegisterOrLogin;

public interface IRegisterOrLogin {
	public void RegisterUser(RegisterOrLogin registerOrLogin);
	public void LoginUser(String userName ,String password);

}
