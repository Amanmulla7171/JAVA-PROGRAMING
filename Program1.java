package com.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program1 {

	public static void main(String[] args) throws SQLException {
		
		
	try {	
	Connection connection=DriverManager.getConnection("jdbc:mysql://Localhost:3306/classwork_db", "root", "Aman@7171");
	
	Statement statement=connection.createStatement();
	ResultSet rs=statement.executeQuery("SELECT *FROM emp");
	
	while(rs.next()) {
		System.out.println(rs.getInt(1)+"-"+rs.getString(2)+"-"+rs.getString(3));
	}
	statement.close();
	connection.close();
	}catch(SQLException e) {
		e.printStackTrace();
		
	}
	
	

	}

}
