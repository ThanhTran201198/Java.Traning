package vn.fis.traning.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.fis.traning.entity.Category;
import vn.fis.traning.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{
	boolean existsByName(String name);
	Product findByName(String name);
	List<Product> findByCategory(Category category);
	
}
