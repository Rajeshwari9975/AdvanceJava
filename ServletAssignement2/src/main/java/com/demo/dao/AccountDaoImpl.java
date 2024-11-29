package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Account;

public class AccountDaoImpl implements AccountDao {
	
	private static Connection conn;
	private static PreparedStatement getAcs,delAcById,addAc;
	
	static {
		
		try {
			conn = DBUtil.getConnection();
			getAcs = conn.prepareStatement("select * from account");
			delAcById = conn.prepareStatement("delete from account where aid = ?");
			addAc = conn.prepareStatement("insert into account values(?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Account> getAllAccounts() {
		List<Account> acList = new ArrayList<Account>();
		try {
			ResultSet rs = getAcs.executeQuery();
			while(rs.next()) {
				acList.add(new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return acList;
		
	}

	@Override
	public int deleteById(int aid) {
		try {
			delAcById.setInt(1, aid);
			int n = delAcById.executeUpdate(); 
			return n;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int addAccount(Account a) {
		try {
			addAc.setInt(1, a.getAid());
			addAc.setString(2, a.getName());
			addAc.setString(3, a.getEmail());
			addAc.setInt(4, a.getBalance());
			int n = addAc.executeUpdate();
			return n;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
