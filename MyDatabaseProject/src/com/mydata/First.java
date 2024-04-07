package com.mydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class First {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url ="jdbc:mysql://localhost:3306/myproject";
		String username = "root";
		String pass="Sanika@123";
		try {
			Connection co = DriverManager.getConnection(url,username,pass);
			 Statement st = co.createStatement();
			ResultSet rst = st.executeQuery("SELECT * FROM STUDENT1");
			while(rst.next()) {
				int rollNo = rst.getInt("id");
				String name = rst.getString("name");
				int age = rst.getInt("age");
				System.out.println(" Roll No: "+rollNo+" name: "+name+" age: "+age);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
