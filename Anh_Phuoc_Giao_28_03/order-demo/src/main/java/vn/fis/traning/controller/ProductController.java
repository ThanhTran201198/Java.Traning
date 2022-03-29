package vn.fis.traning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import vn.fis.traning.entity.Product;
import vn.fis.traning.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<?> add(@RequestBody Product product){
		return ResponseEntity.ok(productService.addProduct(product));
	}
	@PostMapping("/update")
	@ResponseBody
	public ResponseEntity<?> update(@RequestBody Product product){
		return ResponseEntity.ok(productService.updateProduct(product));
	}
	
	@GetMapping("/delete/{productId}")
	@ResponseBody
	public ResponseEntity<?> delete(@PathVariable Long productId){
		return ResponseEntity.ok(productService.deleteProduct(productId));
	}
	@GetMapping("/findById/{productId}")
	@ResponseBody
	public ResponseEntity<?> findById(@PathVariable Long productId){
		return ResponseEntity.ok(productService.findById(productId));
	}
}
