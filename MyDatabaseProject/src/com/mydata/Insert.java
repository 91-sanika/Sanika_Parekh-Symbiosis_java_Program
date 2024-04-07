package com.mydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Insert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","Sanika@123");
			Statement st = co.createStatement();
			int rs =st.executeUpdate("Insert into Student1 (id,name,age)values(91,'Sanika',22) , (92,'Saniya',23)");
			System.out.println("Done"+rs+"Cloumn affected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
