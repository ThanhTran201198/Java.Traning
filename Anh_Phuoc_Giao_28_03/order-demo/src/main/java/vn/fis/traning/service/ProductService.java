package vn.fis.traning.service;

import vn.fis.traning.entity.Product;

public interface ProductService {
	Product addProduct(Product product);
	Product updateProduct(Product product);
	String deleteProduct(Long productId);
	Product findById(Long productId);
}
