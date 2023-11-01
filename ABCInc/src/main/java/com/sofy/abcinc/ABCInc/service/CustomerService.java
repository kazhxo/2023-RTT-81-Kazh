package com.sofy.abcinc.ABCInc.service;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sofy.abcinc.ABCInc.model.Customer;
import com.sofy.abcinc.ABCInc.myinterface.CustomerDAO;

public class CustomerService implements CustomerDAO{

	@Override
	public List<Customer> getAllCustomers() {
		
		SessionFactory factory = new
				Configuration().configure().buildSessionFactory();
				Session session = factory.openSession();
				
				String hql="SELECT * from CUSTOMER";
				Query query = session.createQuery(hql);
				List<Customer> customers = query.getResultList();
				
				for(Customer c: customers) {
					System.out.println("Customer id: " + c.getId() + " customer email: " + c.getEmail() + " customer name " + c.getName() + " customer password: " + c.getPassword());
				}
				return customers;
	}

	@Override
	public Customer getCustomerByEmail() {
		SessionFactory factory = new
				Configuration().configure().buildSessionFactory();
				Session session = factory.openSession();
				
				String hql= "SELECT CUSTOMER c WHERE "
		
	}

	@Override
	public List<Customer> getCustomersOrders() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
