//package vn.fis.traning.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import vn.fis.traning.entity.Product;
//import vn.fis.traning.repo.ProductRepo;
//import vn.fis.traning.service.ProductService;
//
//@Service
//public class ProductServiceImpl implements ProductService{
//	
//	@Autowired
//	ProductRepo productRepo;
//	
//	@Override
//	public Product addProduct(Product product) {
//		if(productRepo.existsByName(product.getName())) return null;
//		return productRepo.save(product);
//	}
//
//	@Override
//	public Product updateProduct(Product product) {
////		if(!productRepo.existsByName(product.getName())) return null;
//		return productRepo.save(product);
//	}
//
//	@Override
//	public String deleteProduct(Long productId) {
//		if(!productRepo.existsById(productId)) return "Không tồn tại!";
//		productRepo.deleteById(productId);
//		return "Xóa sản phẩm thành công";
//	}
//
//	@Override
//	public Product findById(Long productId) {
//		return productRepo.findById(productId).orElse(null);
//	}
//	
//}
