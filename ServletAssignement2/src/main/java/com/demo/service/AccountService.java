package com.demo.service;

import java.util.List;

import com.demo.beans.Account;

public interface AccountService {

	List<Account> getAllAccounts();

	int deleteById(int aid);

	int addAccount(Account a);

}
