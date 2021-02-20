package com.springproject1.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springproject1.springdemo.dao.CustomerDAO;
import com.springproject1.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDao;
	
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		return customerDao.getCustomers();
	}


	@Transactional
	@Override
	public void saveCustomer(Customer customer) {
		
		customerDao.saveCustomer(customer);
		
	}

	@Transactional
	@Override
	public Customer getCustomer(int customerId) {
		
		return customerDao.getCustomers(customerId);
	}

	
	@Transactional
	@Override
	public void deleteCustomer(int customerId) {
		
		customerDao.deleteCustomer(customerId);
		
	}

}
