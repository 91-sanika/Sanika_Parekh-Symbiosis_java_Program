package com.mydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class FromUser {

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
				 Scanner sc = new Scanner(System.in);
				 System.out.println("Enter id");
				 int id = sc.nextInt();
				 System.out.println("Enter name");
				 String name = sc.next();
				 System.out.println("Enter age");
				 int age = sc.nextInt();
				 c.setInt(1, id);
				 c.setString(2,name);
				 c.setInt(3, age);
				  int a = c.executeUpdate();
				  System.out.println(a+ "Data inserted");
				} catch (SQLException e) {
				
				e.printStackTrace();
			}

		}}
