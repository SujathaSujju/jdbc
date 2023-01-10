package maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class hotel {

	public static void main(String args[]) {

   String username = "root";
   String password = "Sujatha@123";
   String host = "jdbc:mysql://local host:3306/XWORKZ";
    
   try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection(host, username, password);
	
	String query = "INSERT INTO HOTELS VALUES(?,?,?,?,?)";
	
	PreparedStatement statement = connection.prepareStatement(query);
	
	statement.setString(1, "mallige");
	statement.setString(2, "belgaum");
	statement.setInt(3,4);
	statement.setInt(4,4);
	statement.setString(5,"HK");
	
	
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
   
	}
}
