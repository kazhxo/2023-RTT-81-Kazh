package com.kazhan.bookdaojdbc;

import com.kazhan.bookdaojdbc.model.Book;

import java.util.ArrayList;

import com.kazhan.bookdaojdbc.controller.BookDaoImpl;
import com.kazhan.bookdaojdbc.daointerface.*;

public class App 
{
    public static void main( String[] args )
    {
       BookDao obj= new BookDaoImpl();
      // System.out.println(obj.getAllBooks());
       
       ArrayList<Book> booklist = new ArrayList<Book>();
       booklist.add(new Book(6,101, "Advanced Java Development"));
       obj.saveBook(booklist);
      // System.out.println("=======Book inserted successfully=======");
        
     //  obj.deleteBook(6);
     //  System.out.println("=========Book deleted successfully=======");
       
       //create book obj with bookname and isbn
       Book bookObj= new Book(150,"Intermediate Java Book");
       
       //we are updating the id to what we pass in
       obj.updateBook(bookObj,4);
       System.out.println("=====Book updated successfully=====");
    }
}
