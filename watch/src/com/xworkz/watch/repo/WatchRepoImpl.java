package com.xworkz.watch.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.util.DButil;

public class WatchRepoImpl implements WatchRepo{

	@Override
	public boolean save(WatchDto dto) {
          
		String query = "insert into watch values(?,?,?,?,?)";
		
		
		
		try(Connection connection = DButil.getconnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getColour());
			statement.setString(4, dto.getType());
			statement.setInt(5, dto.getPrice());
			
			statement.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<WatchDto> read() {
		
		String query = "select * from watch";
		
		try (Connection connection = DButil.getconnection();
				PreparedStatement statement = connection.prepareStatement(query);){
			
			 ResultSet resultset= statement.executeQuery();
			
			List<WatchDto> list = new ArrayList<WatchDto>();
			 
			 while(resultset.next()) {
				int id = resultset.getInt(1);
				String name = resultset.getString(2);
				String colour = resultset.getString(3);
				String type =  resultset.getString(4);
				int price = resultset.getInt(5);
				 
				 WatchDto dto = new WatchDto(id, name, colour, type, price);
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
	public List<WatchDto> findByNameAndColour(String name, String colour) {
		
		String query = "select * from watch where name=? and colour=?";
		
		
		try(Connection connection = DButil.getconnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1, name);
			statement.setString(2, colour);
			
			 ResultSet resultset = statement.executeQuery();
			
			 List<WatchDto> list = new ArrayList<WatchDto>();
			 
			 while(resultset.next()) {
				 int id = resultset.getInt(1);
					String name1 = resultset.getString(2);
					String colour1 = resultset.getString(3);
					String type =  resultset.getString(4);
					int price = resultset.getInt(5);
					
					WatchDto dto = new WatchDto(id, name1, colour1, type, price);
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
	public List<WatchDto> findByIdAndType(int id, String type) {
String query = "select * from watch where id=? and type=?";
		
		
		try(Connection connection = DButil.getconnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setInt(1, id);
			statement.setString(2, type);
			
			 ResultSet resultset = statement.executeQuery();
			
			 List<WatchDto> list = new ArrayList<WatchDto>();
			 
			 while(resultset.next()) {
				 int id1 = resultset.getInt(1);
					String name1 = resultset.getString(2);
					String colour1 = resultset.getString(3);
					String type1 =  resultset.getString(4);
					int price = resultset.getInt(5);
					
					WatchDto dto = new WatchDto(id, name1, colour1, type, price);
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
	public boolean updateNameById(String name, int id) {
         
		String query = "update watch set name =? where id=?";
		
		try(Connection connection = DButil.getconnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1, name);
			statement.setInt(2, id);
			
			statement.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteByColourandType(String colour, String type) {
        String query = "delete from watch where colour =? and type=?";
		
		try(Connection connection = DButil.getconnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
		
			statement.setString(1, colour);
			statement.setString(2, type);
			
			statement.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
