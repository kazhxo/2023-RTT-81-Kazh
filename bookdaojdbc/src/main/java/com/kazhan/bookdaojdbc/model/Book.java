package com.kazhan.bookdaojdbc.model;

//pojo has empty constructor, parameterized constructer, and getts and setters
//also to string method

public class Book {

	private int id;
	private int isbn;
	private String bookName;
	
	
	
	//right click and hit source generate constructor
	//we dont include id because we will auto increment in database
	public Book(int id, int isbn, String bookName) {
		super();
		this.id=id;
		this.isbn = isbn;
		this.bookName = bookName;
	}
	
	private void doSo() {
		
	}
	
	public Book() {
		this.isbn=0;
		this.bookName="";
		
		
	}
	
	public Book(int isbn, String bookName) {
		super();
		this.isbn=isbn;
		this.bookName=bookName;
	}


	//right click and hit source
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", bookName=" + bookName + "]";
	}
	
	
	
	
	
}
