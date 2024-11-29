package com.demo.service;

import com.demo.Dao.LoginDao;
import com.demo.Dao.LoginDaoImpl;
import com.demo.beans.User;

public class LoginServiceImpl  implements LoginService{
   private LoginDao ldao;
   public LoginServiceImpl() {
		ldao = new LoginDaoImpl();
	
}





	@Override
	public User validateData(String uname, String pwd) {
		
		
		return ldao.validateData(uname,pwd);
	}

}
