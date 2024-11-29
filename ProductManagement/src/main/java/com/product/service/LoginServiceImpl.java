package com.product.service;

import com.product.bean.User;
import com.product.dao.LoginDao;
import com.product.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	
	private LoginDao ldao;
	
	public LoginServiceImpl() {
		ldao = new LoginDaoImpl();
	}

	@Override
	public User validateData(String uname, String pwd) {
		return ldao.validateData(uname,pwd);
	}

}
