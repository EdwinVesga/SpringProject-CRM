package com.springproject1.springdemo.dao;

import java.util.List;

import com.springproject1.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomers(int customerId);

	public void deleteCustomer(int customerId);

}
