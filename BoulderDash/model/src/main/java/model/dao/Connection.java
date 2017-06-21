/*package model.dao;

import java.sql.DriverManager;

import com.mysql.cj.api.jdbc.Statement;

public class Connection {

	public void connection (String[] args){	//connection to the database
		
			String url = "jdbc:mysql://localhost/test?useSSL=false&serverTimezone=UTC"; //database url
			String user = "root"; //user name
			String password = ""; //user password
			
	try{
		
		Connection connection = DriverManager.getConnection(this.url, this.user, this.password);
		Statement statement = (Statement) ((java.sql.Connection) connection).createStatement();
		ResultSet result = statement.executeQuery("CALL getLevel("+ id +")");  // TO DO recover the level id
	}
	
	catch (Exception e){
		e.printStackTrace();
	}
		
	}
	
}*/
