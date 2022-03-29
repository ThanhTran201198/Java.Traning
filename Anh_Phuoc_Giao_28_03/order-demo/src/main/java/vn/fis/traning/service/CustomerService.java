package vn.fis.traning.service;

import org.springframework.stereotype.Service;

import vn.fis.traning.entity.Customer;

public interface CustomerService {
	Customer addCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	String deleteCustomer(Long customerId);
	Customer findById(Long customerId);
}
