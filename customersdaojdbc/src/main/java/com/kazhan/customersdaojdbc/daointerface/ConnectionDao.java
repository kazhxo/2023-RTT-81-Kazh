package com.kazhan.customersdaojdbc.daointerface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDao {
	
	//static belongs only to this class
	
	static Connection conn= null;
	
	//protected can be accessed by any class in package
	protected PreparedStatement ps= null;
	protected ResultSet rs=null;
	
	

	//create connection to sql database
	//returns connection 
	
	//connects to books database
	public static Connection getConnection() {
		final String dburl="jdbc:mysql://localhost:3306/books";
		final String dbuser="root";
		final String dbpassword= "password";
		
	try {
		conn= DriverManager.getConnection(dburl,dbuser,dbpassword);
		System.out.println("Connected Database Successfully");
	
	}catch(SQLException e){
		System.out.println(e);
		e.printStackTrace();
		
	}
		return conn;
	}
	
	public void disconnect()
	   {
	      try {
	         if(rs != null)
	         {
	            rs.close();
	         }
	         if(ps != null)
	         {
	            ps.close();
	         }
	         if(conn != null)
	         {
	            conn.close();
	         }
	        
	      }catch (Exception e) {
	        
	      
		}
		
	}
	
}
