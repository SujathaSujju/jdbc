package com.xworkz.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.xworkz.constants.sqlCrendential;
import com.xworkz.dto.SoapDto;

public class SoapRepoImpl implements SoapRepo {

	@Override
	public boolean save(SoapDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(sqlCrendential.URL.getvalue(),
					sqlCrendential.USERNAME.getvalue(), sqlCrendential.PASSWORD.getvalue());

			String query = "insert into soap values(?,?,?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getColour());
			statement.setString(4, dto.getFragrance());
			statement.setInt(5, dto.getWeight());
			statement.setString(6, dto.getManufacturedate());
			statement.setString(7, dto.getType());
			statement.setInt(8, dto.getPrice());

			statement.executeUpdate();
			statement.close();

			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<SoapDto> read() {

		List<SoapDto> list = new ArrayList<SoapDto>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(sqlCrendential.URL.getvalue(),
					sqlCrendential.USERNAME.getvalue(), sqlCrendential.PASSWORD.getvalue());

			String query = "select * from soap";

			PreparedStatement statement = connection.prepareStatement(query);

			ResultSet resultset = statement.executeQuery();

			while (resultset.next()) {
				int id = resultset.getInt("id");
				String name = resultset.getString("name");
				String colour = resultset.getString("colour");
				String fragrance = resultset.getString("fragrance");
				int weight = resultset.getInt("weight");
				String manufacturedate = resultset.getString("manufacturedate");
				String type = resultset.getString("type");
				int price = resultset.getInt("price");

				SoapDto dto = new SoapDto(id, name, colour, fragrance, weight, manufacturedate, type, price);
				list.add(dto);

			}
			statement.close();
			connection.close();

			return list;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public SoapDto findByNameAndPrice(String name, int price) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(sqlCrendential.URL.getvalue(),
					sqlCrendential.USERNAME.getvalue(), sqlCrendential.PASSWORD.getvalue());

			String query = "select * from soap where name=? and price=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);
			statement.setInt(2, price);
			ResultSet resultset = statement.executeQuery();

			while (resultset.next()) {

				int id = resultset.getInt("id");
				String name1 = resultset.getString("name");
				String colour = resultset.getString("colour");
				String fragrance = resultset.getString("fragrance");
				int weight = resultset.getInt("weight");
				String manufacturedate = resultset.getString("manufacturedate");
				String type = resultset.getString("type");
				int price1 = resultset.getInt("price");

				SoapDto dto = new SoapDto(id, name, colour, fragrance, weight, manufacturedate, type, price);
				return dto;
			}
			
			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean updateNameByPrice(String name, int price) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(sqlCrendential.URL.getvalue(),
					sqlCrendential.USERNAME.getvalue(), sqlCrendential.PASSWORD.getvalue());

			String query = "update soap set name=? where  price=?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1, name);
			statement.setInt(2, price);
			
			statement.executeUpdate();
			
			statement.close();
			connection.close();
			
			
			return true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updatecolourAndFragranceByName(String colour, String fragrance, String name) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(sqlCrendential.URL.getvalue(),
					sqlCrendential.USERNAME.getvalue(), sqlCrendential.PASSWORD.getvalue());
            
			String query = "update soap set colour=?,fragrance =? where name =?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1, colour);
			statement.setString(2, fragrance);
			statement.setString(3, name);
			
			statement.executeUpdate();
			statement.close();
			
			connection.close();
			return true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateTypeById(String type, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(sqlCrendential.URL.getvalue(),
					sqlCrendential.USERNAME.getvalue(), sqlCrendential.PASSWORD.getvalue());
            
			String query="update soap set type =? where id=?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1, type);
			statement.setInt(2, id);
			
			statement.executeUpdate();
			
			statement.close();
			connection.close();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
