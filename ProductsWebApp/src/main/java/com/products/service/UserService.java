package com.products.service;

import com.products.bean.User;

public interface UserService {

	User validateCred(String uname, String pwd);

}
