package com.mydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
		try {
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","Sanika@123");
			Statement st = co.createStatement();
			int rs = st.executeUpdate("UPDATE Student1 SET name='Sakshi' where id= 1 ; ");
			System.out.println("done "+rs+ "rows affcted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
