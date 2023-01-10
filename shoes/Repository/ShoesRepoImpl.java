package com.xworkz.shoes.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.shoes.sqlCrendential;
import com.xworkz.shoes.Shoesdto.ShoesDto;

public class ShoesRepoImpl implements ShoesRepo{

	@Override
	public boolean save(ShoesDto dto) {
	   
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(sqlCrendential.URL.getvalue(), sqlCrendential.USERNAME.getvalue(), sqlCrendential.PASSWORD.getvalue());
			
			String query = "insert into shoes values(?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, dto.getId());
			statement.setString(2,dto.getBrandName());
			statement.setInt(3, dto.getSize());
			statement.setString(4, dto.getColor());
			statement.setInt(5, dto.getPrice());
			
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

	@Override
	public ShoesDto read() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
Connection connection = DriverManager.getConnection(sqlCrendential.URL.getvalue(), sqlCrendential.USERNAME.getvalue(), sqlCrendential.PASSWORD.getvalue());
			
			String query = "select * from shoes where id=?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1,1);
			
			ResultSet set = statement.executeQuery();
			set.next();
			
			int ID = set.getInt("id");
			String brandname = set.getString("brandName");
			int size = set.getInt("size");
			String colour = set.getString("color");
			int price = set.getInt("price");
			
			System.out.println("id : "+ID+"brandname : "+brandname+"size : "+size+"color : "+colour+"price : "+price);
			
	
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
	public ShoesDto findByName(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
Connection connection = DriverManager.getConnection(sqlCrendential.URL.getvalue(), sqlCrendential.USERNAME.getvalue(), sqlCrendential.PASSWORD.getvalue());
			
			String query = "select * from shoes where brandName=?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1,name);
			
			ResultSet set = statement.executeQuery();
//			set.next();
//			
//			int ID = set.getInt("id");
//			String brandname = set.getString("brandName");
//			int size = set.getInt("size");
//			String colour = set.getString("color");
//			int price = set.getInt("price");
//			
//			System.out.println("id : "+ID+" brandname : "+brandname+ " size : "+size+" color : "+colour+" price : "+price);
//			
//	
			while(set.next()) {
				int ID = set.getInt("id");
				String brandname = set.getString("brandName");
				int size = set.getInt("size");
				String colour = set.getString("color");
				int price = set.getInt("price");
				
				ShoesDto dto = new ShoesDto(ID,brandname,size,colour,price);
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
	public ShoesDto findByNameAndId(String name, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
Connection connection = DriverManager.getConnection(sqlCrendential.URL.getvalue(), sqlCrendential.USERNAME.getvalue(), sqlCrendential.PASSWORD.getvalue());
			
			String query = "select * from shoes where brandName = ? and id=?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1,name);
			statement.setInt(2, id);
			
			ResultSet set = statement.executeQuery();
	
			while(set.next()) {
				int ID = set.getInt("id");
				String brandname = set.getString("brandName");
				int size = set.getInt("size");
				String colour = set.getString("color");
				int price = set.getInt("price");
				
				ShoesDto dto = new ShoesDto(ID,brandname,size,colour,price);
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
