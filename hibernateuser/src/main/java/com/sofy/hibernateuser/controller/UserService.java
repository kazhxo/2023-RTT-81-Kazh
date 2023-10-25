package com.sofy.hibernateuser.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kazhan.hibernateuser.model.User;

public class UserService {

	public void createUserTable() {
		
		//opens up sesson and begins transaction
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session= factory.openSession();
	
		Transaction t= session.beginTransaction();
		
		//user is part of the mapping, because its in the model class
		User user= new User();
		
		t.commit();
		System.out.println("Successfully created users table");
		
		factory.close();
		session.close();
		
	}
	
	
}
