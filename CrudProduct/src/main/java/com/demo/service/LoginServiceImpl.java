package com.demo.service;

import com.demo.beans.User;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
	private LoginDao ldao;
	
	

	public LoginServiceImpl() {
		ldao = new LoginDaoImpl();
	}



	@Override
	public User LoginUser(String uname, String pwd) {
		
		
		return ldao.ValidUser(uname,pwd);
	}

}
