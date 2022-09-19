package com.masai.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.exceptions.InvalidAccountException;
import com.masai.model.Customer;

@Service
public interface UserService {
	
  public Customer validLogin(String mobileNumber, String password) throws InvalidAccountException;
  
  public List<Customer> getList();
  
  public Customer updateCustomer(Customer customer);
}
