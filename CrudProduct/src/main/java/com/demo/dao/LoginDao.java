package com.demo.dao;

import com.demo.beans.User;

public interface LoginDao {

	User ValidUser(String uname, String pwd);

}
