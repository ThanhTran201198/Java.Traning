package vn.fis.traning.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.fis.traning.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
	boolean existsByUsername(String username);
	Optional<Customer> findById(Long customerId);
	Customer findByUsername(String username);
}
