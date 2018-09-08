package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;



public class TestJdbc {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSl=false";
		String user="root";
		String pass="root";
		try {
			
			Connection myCon=DriverManager.getConnection(url,user,pass);
			
			System.out.println("Connection is sucessful::"+myCon);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
