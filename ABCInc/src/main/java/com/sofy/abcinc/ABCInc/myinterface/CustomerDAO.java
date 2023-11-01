package com.sofy.abcinc.ABCInc.myinterface;

import java.util.List;

import com.sofy.abcinc.ABCInc.model.Customer;

public interface CustomerDAO {
	
	public List<Customer> getAllCustomers();
	
	public Customer getCustomerByEmail();
	
	public List<Customer> getCustomersOrders();
	

}
