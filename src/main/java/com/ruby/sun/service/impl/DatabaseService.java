package com.ruby.sun.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {
	private static Connection con;

	public DatabaseService() throws ClassNotFoundException, SQLException {
		//if (con.isClosed()) {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql:" + "//localhost:3306/employees", "root", "root");
		//}
	}

	public int runQuery(String sql) throws ClassNotFoundException, SQLException {
		return con.createStatement().executeUpdate(sql);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String sql = "select count(*) from employees";
		DatabaseService dataService = new DatabaseService();
		System.out.println(dataService.runQuery(sql));;
	}
}
