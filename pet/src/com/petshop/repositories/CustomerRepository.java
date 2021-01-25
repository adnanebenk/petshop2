package com.petshop.repositories;

import java.util.List;

import com.petshop.beans.Customer;

public interface CustomerRepository {
	
	public List<Customer> getAllCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomerById(Integer id);
	public Customer getCustomerByUsername(String username);
	public boolean usernameExists(String username);
	public String getHashedPassword(String username);

}
