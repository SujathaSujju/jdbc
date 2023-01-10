package com.xworkz.bag.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.bag.BagDto;
import com.xworkz.bag.SqlCredential;



public class BagRepoImpl implements BagRepo{

	@Override
	public boolean save(BagDto dto) {
      
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(SqlCredential.URL.getvalue(), SqlCredential.USERNAME.getvalue(), SqlCredential.PASSWORD.getvalue());
			
			String query ="insert into bag values(?,?,?,?,?)"; 
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getColour());
			statement.setInt(4, dto.getPrice());
			statement.setString(5, dto.getCapacity());
			
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
		
		
		return true;
	}

	@Override
	public BagDto read() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
Connection connection = DriverManager.getConnection(SqlCredential.URL.getvalue(), SqlCredential.USERNAME.getvalue(), SqlCredential.PASSWORD.getvalue());
			
			String query = "select * from bag where id=?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1,2);
			
			ResultSet set = statement.executeQuery();
			set.next();
			
			int ID = set.getInt("id");
			String name = set.getString("name");
			String colour = set.getString("colour");
			int price = set.getInt("price");
			String capacity = set.getString("capacity");
			
			System.out.println("id : "+ID+" name : "+name+" colour : "+colour+"price : "+price+" capacity : "+capacity);
			
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public BagDto findByName(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
Connection connection = DriverManager.getConnection(SqlCredential.URL.getvalue(), SqlCredential.USERNAME.getvalue(), SqlCredential.PASSWORD.getvalue());
			
			String query = "select * from bag where name=?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1,name);
			
			ResultSet set = statement.executeQuery();

			while(set.next()) {
				int ID = set.getInt("id");
				String name1 = set.getString("name");
				String colour = set.getString("colour");
				int price = set.getInt("price");
				String capacity = set.getString("capacity");
				
				BagDto dto = new BagDto(ID,name,colour,price,capacity);
				return dto;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public BagDto findByNameAndId(String name, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
Connection connection = DriverManager.getConnection(SqlCredential.URL.getvalue(), SqlCredential.USERNAME.getvalue(), SqlCredential.PASSWORD.getvalue());
			
			String query = "select * from bag where name = ? and id=?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1,name);
			statement.setInt(2, id);
			
			ResultSet set = statement.executeQuery();
	
			while(set.next()) {
				int ID = set.getInt("id");
				String name3 = set.getString("name");
				String colour = set.getString("colour");
				int price = set.getInt("price");
				String capacity = set.getString("capacity");
				
				BagDto dto = new BagDto(ID,name,colour,price,capacity);
				return dto;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return null;
	}

}
