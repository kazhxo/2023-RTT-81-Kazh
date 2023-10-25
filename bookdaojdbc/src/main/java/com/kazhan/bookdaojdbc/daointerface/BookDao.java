package com.kazhan.bookdaojdbc.daointerface;

import java.util.List;

import com.kazhan.bookdaojdbc.model.Book;

public interface BookDao {
	
	List<Book> getAllBooks();
	
	void saveBook(List<Book> booList);
	
	boolean deleteBook(int id);
	
	boolean updateBook(Book book, int id);
	
	

}
