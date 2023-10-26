package com.sofy.hibernateuser.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kazhan.hibernateuser.model.User;

public class UserService {

	public void createUserTable() {

		// EACH OPERATION NEEDS OWN SESSION

		// opens up sesson and begins transaction
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		// user is part of the mapping, because its in the model class
		User user = new User();

		t.commit();
		System.out.println("Successfully created users table");

		factory.close();
		session.close();

	}

	public void createUser() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		User uone = new User();
		uone.setEmail("hasseb@gmail.com");
		uone.setFullname("Moh Haseeb");
		uone.setSalary(2000.99);
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

		User ufour = new User("Christ", "christ@gmail.com", "12345", 35, 35000.00, "Atlanta");

		User ufive = new User("Sid", "sid@gmail.com", "4567", 25, 4000.00, "Louisville");

		session.persist(uone);
		session.persist(uTwo);
		session.persist(uThree);
		session.persist(ufour);
		session.persist(ufive);

		t.commit();
		System.out.println("Successufly Saved");
		factory.close();
		session.close();
	}

	public void findUser(int id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		//begin transaction
		Transaction t = session.beginTransaction();
		
		//goes to user class and finds the id that was passed in
		User u= session.get(User.class, id);
		System.out.println("Fullname " + u.getFullname());
		System.out.println("Email: " + u.getEmail());
		System.out.println("Passord: " + u.getPassword());
		
		//commit changes/transaction
		t.commit();
		
		factory.close();	
		session.close();
	
		

	}
	
	public void updateUser(int id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		//begin transaction
		Transaction t = session.beginTransaction();
		
		User u= new User();
		u.setId(id);
		u.setFullname("Lewis");
		u.setEmail("Lewis@gmail.com");
		u.setPassword("1234");
		u.setCity("Atlanta");
		
		//mege is to update
		session.merge(u);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
		
	}
	public void deleteUser(int id) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		//begin transaction
		Transaction t = session.beginTransaction();
		
		User u= new User();
		u.setId(id);
		session.remove(u);
		t.commit();
		session.close();
		factory.close();
	}
	
}
