package com.xworkz.treerepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.tree.TreeDto;

public class TreeRepoImpl implements TreeRepo{

	@Override
	public boolean save(TreeDto dto) {
		String username = "root";
		String password = "Xworkzodc@123";
		String host = "jdbc:mysql://localhost:3306/tree";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(host, username, password);

			String query = "INSERT into plants value(?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, 1);
			statement.setString(2, "banana");
			statement.setString(3, "green");
			statement.setString(4, "fruit");
			statement.setInt(5, 1);
			statement.setDouble(6, 5.5);

			

			statement.executeUpdate();
			statement.close();

			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
