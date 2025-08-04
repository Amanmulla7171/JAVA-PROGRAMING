package com.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Progarm {

	public static void main(String[] args) {
		
//		try {
//			
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		
		
		try {
		Connection connection=DriverManager.getConnection("jdbc:mysql://Localhost:3306/dkte_db", "root", "Aman@7171");
			
			Statement statement=connection.createStatement();
		 ResultSet rs=statement.executeQuery("SELECT *FROM student" );
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " - " + rs.getString(2)+"-"+rs.getDouble(3));
		}
		statement.close();
		connection.close();

	} catch (SQLException e) {
		e.printStackTrace();
	}
			
		}
		
			
	

	}


