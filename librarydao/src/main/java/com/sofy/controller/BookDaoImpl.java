package com.sofy.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sofy.Daointerface.BookDao;
import com.sofy.Daointerface.ConnectionDao;
import com.sofy.model.Books;

public class BookDaoImpl extends ConnectionDao implements BookDao {

	@Override
	public List<Books> getAllBooks() throws ClassNotFoundException, SQLException {
		try {
			Connection connection= ConnectionDao.getConnection();
			Statement stmt= connection.createStatement();
			ResultSet rs= stmt.executeQuery("SELECT * FROM books");
			List booklist= new ArrayList();
			
			{
			while(rs.next()) {
				Books b=new Books();
				b.setIsbn(rs.getInt("isbn"));
				b.setBookName(rs.getString("bookName"));
				booklist.add(b);
			}
			return bookList;
		
	}catch(SQLException ex) {
		ex.printStackTrace();
		System.out.println("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
	}catch(ClassNotFoundException e) {
		e.printStackTrace();

		}
		}
	@Override
	public void saveBook(List<Books> BookList) {
		try {
	          Connection con = ConnectionDao.getConnection();
	          for(Books b: BookList) {
        	  String sqlQuery= "INSERT INTO books (isbn,bookName) VALUES (?,?)";
        	  PreparedStatement prepStmt= con.prepareStatement(sqlQuery);
        	  prepStmt.setInt(1,b.getIsbn());
        	  prepStmt.setString(2, b.getBookName());
        	  
        	  int affectedRows= prepStmt.executeUpdate();
        	  System.out.println(affectedRows + " row(s) affected !!");
	          
	          }
		
		
		}catch(ClassNotFoundException e) {
			
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
			
		}
		
		
		
		
	@Override
	public boolean deleteBook(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBook(Books book, int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
