package com.solarservices.oswalservices.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

	private static final String URL = "jdbc:mysql://junction.proxy.rlwy.net:29214/solarservices";
	private static final String USER = "root";
	private static final String PASSWORD = "HburqaJheEbPczwXyREVimuqIDLZdDRa";

//	private static final String URL = "jdbc:mysql://127.0.0.1:3306/solarservices";
//	private static final String USER = "root";
//	private static final String PASSWORD = "root";

	public static Connection getConnection() throws SQLException {
		try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.err.println("Connection failed: " + e.getMessage());
			throw e;
		}
	}
}
