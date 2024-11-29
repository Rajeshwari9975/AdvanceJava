package com.products.dao;

import com.products.bean.User;

public interface UserDao {

	User validateData(String uname, String pwd);

}
