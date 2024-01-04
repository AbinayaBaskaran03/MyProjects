package com.jdbcbasic.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static Connection getconnection() throws ClassNotFoundException, SQLException {
		System.out.println("getconnection started");

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver executed");

		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.155.156:3306/dbms_april_2023",
				"dbms_april_2023", "Ebrain@20");
		System.out.println("JDBC executed "+connection);

		return null;
	}

	public static void main(String[] args) throws Exception {
		getconnection();
	}
}
