package com.petshop.services;

import java.util.List;

import com.petshop.beans.Customer;
import com.petshop.repositories.CustomerRepositoryImpl;
import com.petshop.utils.CustomerUtils;

public class CustomerServiceImpl implements CustomerService {

	
	CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
	
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		if(customer != null) {
			
			boolean validUsername = customer.getUsername() != null;
			boolean validPassword = customer.getPassword() != null;
			boolean validEmail = customer.getEmail() != null;
			boolean validPhone = customer.getPhone() != null;
			boolean validCompany = customer.getCompany() != null;
			boolean validAddress = customer.getAddress() != null;
			
		
			if(validUsername && validPassword && validEmail && validPhone && validCompany && validAddress) {
				customerRepository.saveCustomer(customer);
			}
		}
		
	}

	@Override
	public Customer getCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkCredentials(String username, String password) {
		// TODO Auto-generated method stub
		
		
		
		if(username != null && password != null)
		{
			String hashedPassword = getHashedPassword(username);
			boolean validUsername = usernameExists(username);
			boolean validPassword = CustomerUtils.passwordMatchesHash(password, hashedPassword);
			
			if(validUsername && validPassword) {
				return true;
			}
		}else {
			System.out.println("username or password are not defined");
		}
		
		
		return false;
	}

	@Override
	public boolean usernameExists(String username) {
		// TODO Auto-generated method stub
		
		if(username != null && customerRepository.usernameExists(username)){
			return true;
		}
		
		return false;
	}

	@Override
	public String getHashedPassword(String username) {
		// TODO Auto-generated method stub
		
		return customerRepository.getHashedPassword(username);
	}
	
	
	

}
