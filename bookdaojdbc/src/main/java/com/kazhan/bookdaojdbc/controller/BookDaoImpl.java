package com.kazhan.bookdaojdbc.controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kazhan.bookdaojdbc.daointerface.BookDao;
import com.kazhan.bookdaojdbc.daointerface.ConnectionDao;
import com.kazhan.bookdaojdbc.model.Book;

public class BookDaoImpl extends ConnectionDao implements BookDao {

	@Override
	public List<Book> getAllBooks(){
		
		try {
		Connection connection = ConnectionDao.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet rs =stmt.executeQuery("SELECT * from books");
		List bookList= new ArrayList<>();
		
		while(rs.next()) {
			Book b= new Book();
			b.setId(rs.getInt("id"));
			b.setIsbn(rs.getInt("isbn"));
			
			
			b.setBookName(rs.getString("bookName"));
			bookList.add(b);
		}
		return bookList;
		}catch(SQLException ex) {
			
		ex.printStackTrace();
		System.out.printf("SQL State: %s\n%s",ex.getSQLState(), ex.getMessage());
		 
		}
		return null;
	}

	@Override
	public void saveBook(List<Book> bookList) {
		try {
			Connection con= ConnectionDao.getConnection();
			
			//loop through the booklist in parameter
			for(Book b: bookList) {
				
				//question marks relative to the book parameter positions
				
				//create query
				String sqlQuery="INSERT INTO books(id,isbn,bookName)VALUES(?,?,?)";
			
				//create prepared statement for sqlquery
				PreparedStatement ps= con.prepareStatement(sqlQuery);
				
				//sets id
				ps.setInt(1,b.getId());
				
				//sets isbn
				ps.setInt(2,b.getIsbn());
				
				//sets bookName
				ps.setString(3,b.getBookName());
				
				//updates the table,with new records
				int affectedRows= ps.executeUpdate();
				
				//display num of rows affected
				System.out.println(affectedRows+ "row(s) affected");
				
				
				
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public boolean deleteBook(int id) {
		try {
			Connection connection= ConnectionDao.getConnection();
			PreparedStatement ps= connection.prepareStatement("DELETE FROM books WHERE id=?");
			ps.setInt(1, id);
			//update the table
			int i= ps.executeUpdate();
			if(i==1) {
				return true; 
			}
			
		}catch(SQLException e) {
			//%s is place holder for the first message, second message in order
			//formats error message
			System.err.format("SQL State: %s\n%s", e.getSQLState(),e.getMessage());
		}
		return false;
	}

	@Override
	public boolean updateBook(Book book, int id) {
		
		try {
			Connection connection= ConnectionDao.getConnection();
			//position 1 is the position of the first "?" which here is isbn
			PreparedStatement ps= connection.prepareStatement("UPDATE books SET isbn=?, bookName=? WHERE id=?");
			
			ps.setInt(1,book.getIsbn());
			ps.setString(2,book.getBookName());
			//updating the id using the one passed in parameter
			ps.setInt(3, id);
			
			//executeUpdate returns how many rows are affected
			int i=ps.executeUpdate();
			//if  one row is affected it return true, if no row is affected when executeupdate is ran, then returns false
			if(i==1) {
				return true;
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
		return false;
	}
	
	

}
