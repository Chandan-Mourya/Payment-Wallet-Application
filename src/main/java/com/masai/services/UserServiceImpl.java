package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.CustomerException;
import com.masai.exceptions.InvalidAccountException;
import com.masai.model.Customer;
import com.masai.model.Wallet;
import com.masai.repository.CustomerDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	CustomerDao cDao;
	
	@Override
	public Customer validLogin(String mobileNumber, String password) throws InvalidAccountException {

   Optional<Customer> optCustomer = cDao.findByMobileNumber(mobileNumber);
		
		if(!optCustomer.isPresent()) {
			
			throw new InvalidAccountException("Customer Not Found");
		}
		
		if(!optCustomer.get().getPassword().equals(password)) {
			throw new InvalidAccountException("Invalid Password");
		}
		
		return optCustomer.get();
	}

	@Override
	public List<Customer> getList() {
		
      List<Customer> custmerLists = cDao.findAll();
      if(custmerLists.size() <= 0) {
    	  throw new CustomerException("Customer not found..");
      }
	   return custmerLists;
		
		
		
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		Optional<Customer> existingCustomer = cDao.findById(customer.getCustomerId());
		
		Customer c = existingCustomer.get();
		
		c.setName(customer.getName());
		c.setMobileNumber(customer.getMobileNumber());
		c.setPassword(customer.getPassword());
		 
		  
		
		if(!existingCustomer.isPresent()) {
			throw new CustomerException("Customer does not exist.");
		}
		
	    return cDao.save(c);
	}

}
