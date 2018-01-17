package com.SpringPostMethod.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {

	private static Connection con = null;

	public static Connection GetConnection() {
		try {

			if (con == null) {
				String driver = "com.mysql.jdbc.Driver";
				String URL = "jdbc:mysql://localhost:3306/test";
				String user = "root";
				String password = "sa";

				Class.forName(driver);
				con = DriverManager.getConnection(URL, user, password);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return con;
	}

}
