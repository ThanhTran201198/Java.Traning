package vn.fis.traning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.fis.traning.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{
	boolean existsByName(String name);
	Product findByName(String name);
	
}
