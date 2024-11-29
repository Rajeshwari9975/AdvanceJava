package com.demo.service;

import java.util.List;

import com.demo.beans.Account;
import com.demo.dao.AccountDao;
import com.demo.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{
	
	private AccountDao adao;
	
	

	public AccountServiceImpl() {
		adao  = new AccountDaoImpl();
	}



	@Override
	public List<Account> getAllAccounts() {
		return adao.getAllAccounts();
	}



	@Override
	public int deleteById(int aid) {
		return adao.deleteById(aid);
	}



	@Override
	public int addAccount(Account a) {
		return adao.addAccount(a);
	}

}
