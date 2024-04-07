package com.mydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prepare {
	
	private static PreparedStatement preparedStatment;

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","Sanika@123");
			 PreparedStatement c= co.prepareStatement("Insert into Student1 (id,name,age) values(?,?,?) ");
			 c.setInt(1, 67);
			 c.setString(2,"Sharda");
			 c.setInt(3, 45);
			  int a = c.executeUpdate();
			  System.out.println(a+ "Data inserted");
			} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
