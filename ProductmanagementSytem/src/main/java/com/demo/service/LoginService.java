package com.demo.service;

import com.demo.beans.User;

public interface LoginService {



	User validateData(String uname, String pwd);

}
