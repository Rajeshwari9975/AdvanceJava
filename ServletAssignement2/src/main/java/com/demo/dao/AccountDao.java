package com.demo.dao;

import java.util.List;

import com.demo.beans.Account;

public interface AccountDao {

	List<Account> getAllAccounts();

	int deleteById(int aid);

	int addAccount(Account a);

}
