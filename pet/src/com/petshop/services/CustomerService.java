package com.petshop.services;

import java.util.List;

import com.petshop.beans.Customer;

public interface CustomerService {
	
		
	public List<Customer> getAllCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomerById(Integer id);
	public Customer getCustomerByUsername(String username);
	public boolean checkCredentials(String username, String password);
	public boolean usernameExists(String username);
	public String getHashedPassword(String username);

}
