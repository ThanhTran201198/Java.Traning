package vn.fis.traning.service.impl;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.fis.traning.entity.Customer;
import vn.fis.traning.repo.CustomerRepo;
import vn.fis.traning.service.CustomerService;
@Service
public class CustomerServiceImplTest {
	@Autowired
	CustomerRepo customerRepo;
	
	@Test
	void add_Customer_not_exist() {
		Customer customer=new Customer("username", "address", "phone");
		Customer addCustomer= customerRepo.save(customer);
		assertTrue(addCustomer.equals(null));
	}
	
	
}
