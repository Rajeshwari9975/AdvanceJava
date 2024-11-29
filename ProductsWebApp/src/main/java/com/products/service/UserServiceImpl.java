package com.products.service;

import com.products.bean.User;
import com.products.dao.UserDao;
import com.products.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
	
	private UserDao udao;
	
	

	public UserServiceImpl() {
		super();
		udao = new UserDaoImpl();
	}



	@Override
	public User validateCred(String uname, String pwd) {
		return udao.validateData(uname,pwd);
	}

}
