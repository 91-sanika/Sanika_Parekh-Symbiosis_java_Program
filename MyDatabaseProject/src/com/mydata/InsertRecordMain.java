package com.mydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306:/myproject ";
		
		String un ="root";
		String pass="Sanika@123";
		
		Connection conn=null;
		Statement stmt = null;
		ResultSet rs=null;
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url,un,pass);
		stmt = conn.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, name,age");
		String name = sc.next();
		int id = sc.nextInt();
		int age = sc.nextInt();
		
		String s = "Select * form Student1";
		
		rs = stmt.executeQuery(s);
		System.out.println("id\tname\tage");
		while(rs.next()) {
			System.out.println(rs.getInt("id")+"\t"+ rs.getString("name")+"\t" + rs.getInt("age"));
		}
}
}
