package com.demo.test;

import java.sql.DriverManager;

public class TestPreparedStatement {
	public static void main(String[] args) {
		DriverManager.registreDriver(new com.mysql.cj.jdbc.Driver());
	}

}
