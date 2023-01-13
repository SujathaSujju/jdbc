package com.xworkz.shirt.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.xworkz.shirt.dto.ShirtDto;
import com.xworkz.shirt.util.DButil;

public class ShirtRepoImpl implements ShirtRepo {

	@Override
	public boolean save(ShirtDto dto) {
		
		
		String query = "insert into shirt values(?,?,?,?,?)";
		
		try(Connection connection = DButil.getconnection();
		PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getBrandname());
			statement.setString(3, dto.getColour());
			statement.setString(4, dto.getSize());
			statement.setBoolean(5, false);
			
			statement.executeUpdate();
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public List<ShirtDto> read() {
		
		String query = "select * from shirt";
		
		
		try (Connection connection = DButil.getconnection();
				PreparedStatement statement = connection.prepareStatement(query);){
			
			ResultSet data =statement.executeQuery();
			List<ShirtDto> list=new ArrayList<ShirtDto>();
			while(data.next()) {
				int id=data.getInt(1);
				String brandname=data.getString(2);
				String colour=data.getString(3);
				String size = data.getString(4);
				boolean haspocket = data.getBoolean(5);
				
				
				ShirtDto dto=new ShirtDto(id, brandname, colour, size, haspocket);
				list.add(dto);
				
			}
			return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public ShirtDto findNameAndId(String brandname, int id) {
String query="select * from shirt where brandname =? and id=?";
		
		try(Connection connection = DButil.getconnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1,brandname);
			statement.setInt(2, id);
			
			ResultSet set =statement.executeQuery();
		
			set.next();
            int id1 =set.getInt(1);
            String brandname1 =set.getString(2);
            String colour=set.getString(3);
            String size=set.getString(4);
            boolean hasPacket=set.getBoolean(5);
          
            
            ShirtDto dto = new ShirtDto(id1, brandname1, colour, size, hasPacket);
            
            return dto;
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean updateSizeByName(String size, String name) {
		String query = "update shirt set size=? where brandname=?";

		try (Connection connection = DButil.getconnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setString(1, size);
			statement.setString(2, name);

			statement.executeUpdate();

			return true;
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteByColour(String colour) {
		String query = "delete from shirt where colour=?";

		try (Connection connection = DButil.getconnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setString(1, colour);
	

			statement.executeUpdate();

			return true;
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteBySizeAndName(String size, String name) {
		String query = "delete from shirt where size=? and brandname=?";

		try (Connection connection = DButil.getconnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setString(1, size);
			statement.setString(2, name);
			
	

			statement.executeUpdate();
			

			return true;
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

}
