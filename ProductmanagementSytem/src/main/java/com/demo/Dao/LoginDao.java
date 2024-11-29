package com.demo.Dao;

import com.demo.beans.User;

public interface LoginDao {

	User validateData(String uname, String pwd);

}
