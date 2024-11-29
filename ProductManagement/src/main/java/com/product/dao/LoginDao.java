package com.product.dao;

import com.product.bean.User;

public interface LoginDao {

	User validateData(String uname, String pwd);

}
