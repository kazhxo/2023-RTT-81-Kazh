package com.sofy.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserMethods {
	
	
	
	public void CreateUserTable{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		User uone = new User();
		uone.setEmail("haseeb@gmail.com");
		uone.setFullname("Moh Haseeb");
		uone.setPassword("has123");
		uone.setSalary(2000.69);
		uone.setAge(20);
		uone.setCity("NYC");
		User uTwo = new User();
		uTwo.setEmail("James@gmail.com");
		uTwo.setFullname("James Santana");
		uTwo.setPassword("James123");
		uTwo.setSalary(2060.69);
		uTwo.setAge(25);
		uTwo.setCity("Dallas");
		User uThree = new User();
		uThree.setEmail("Shahparan@gmail.com");
		uThree.setFullname("AH Shahparan");
		uThree.setPassword("Shahparan123");
		uThree.setSalary(3060.69);
		uThree.setAge(30);
		uThree.setCity("Chicago");
	}
	

}
