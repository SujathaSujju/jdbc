package com.xworkz.shirt.util;

import java.sql.Connection;
import java.sql.DriverManager;

import com.xworkz.shirt.constants.SqlCredential;

public class DButil {

	public static Connection getconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection(SqlCredential.URL.getvalue(),SqlCredential.USERNAME.getvalue() ,SqlCredential.PASSWORD.getvalue());
			return connection;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
				
		
	}
	
	
	

}

	

