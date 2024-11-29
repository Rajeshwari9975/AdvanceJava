package com.product.service;

import com.product.bean.User;

public interface LoginService {

	User validateData(String uname, String pwd);

}
