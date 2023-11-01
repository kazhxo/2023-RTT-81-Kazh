package com.test.hib.controller;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.Department;

public class DepartmentServices {

	public void Create() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
	       Session session = factory.openSession();

		Transaction tran = session.beginTransaction();

		Department department1 = new Department();
		
		department1.setName("Education");
		department1.setState("Georgia");
		session.persist(department1);
		
		tran.commit();

		System.out.println("successfully created department table");
		
		factory.close();
	    session.close();

	       

	}
	
	public void FindDepartment() {
		SessionFactory factory = new    Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		      
		    int USER_ID = 2;
		    Department dept2 = session.load(Department.class, USER_ID);
		    System.out.println("Fullname: " + dept2.getName());
		    System.out.println("Email: " + dept2.getState());
		   

		    //Close resources
		     tx.commit();
		     factory.close();
		     session.close();

	}

	public void UpdateUser() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		 Department u = new Department();
         u.setId(3);
	    u.setName("driving");
	    u.setState("NY");
	    
	    session.merge(u);
	    session.getTransaction().commit();
	    session.close();

		
	}
	public void deleteUser() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		Department u = new Department();
	    u.setId(3);
	    session.remove
	    tx.commit();
	    session.close();
	    factory.close();

	}
	
}
