package com.solarservices.oswalservices.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

	private static final String URL = "jdbc:mysql://127.0.0.1:3306/solarservices";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
  
    public static Connection getConnection() throws SQLException {
        try {
            // You can specify additional configurations here if needed
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            // If a connection error occurs, print the stack trace
            System.err.println("Connection failed: " + e.getMessage());
            throw e; // rethrow the exception after logging
        }
    }
}
