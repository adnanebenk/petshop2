package com.petshop.repositories;

import java.sql.*;
import java.util.List;

import com.petshop.beans.Customer;
import com.petshop.db.SingletonConnection;

public class CustomerRepositoryImpl implements CustomerRepository {

	
	Connection conn = SingletonConnection.getConnection();

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = conn.prepareStatement("insert into customer(username, password, email, phone, company, address) values (?,?,?,?,?,?)");
			ps.setString(1, customer.getUsername());
			ps.setString(2, customer.getPassword());
			ps.setString(3, customer.getEmail());
			ps.setString(4, customer.getPhone());
			ps.setString(5, customer.getCompany());
			ps.setString(6, customer.getAddress());
			
			ps.executeUpdate();
		
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			try {
				ps.close();
			}
			catch(Exception e) {
				System.out.println(e);
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
		
		
		
		try {
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			ps = conn.prepareStatement("select * from customer where username = ?");
			ps.setString(1, username);
			
			rs = ps.executeQuery();
			
			
			while(rs.next()) {
				if(rs != null) {
					String password = rs.getString("password");
					String email = rs.getString("email");
					String phone = rs.getString("phone");
					String company = rs.getString("company");
					String address = rs.getString("address");
					
					return new Customer(username, password, email, phone, company, address);
				}
					
			}
			
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		
		
		return null;
	}

	
	@Override
	public boolean usernameExists(String username) {
		// TODO Auto-generated method stub
			
		if(getCustomerByUsername(username) != null) {
			return true;
		}
		
		return false;
	}

	@Override
	public String getHashedPassword(String username) {
		// TODO Auto-generated method stub
		return getCustomerByUsername(username).getPassword();
	}
	
	
	
}
