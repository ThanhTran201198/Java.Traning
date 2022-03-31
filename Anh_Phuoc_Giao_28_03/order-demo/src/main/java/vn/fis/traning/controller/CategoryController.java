package vn.fis.traning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import vn.fis.traning.dto.DateBetweenForOneCat;
import vn.fis.traning.dto.DateBetwennDto;
import vn.fis.traning.entity.Category;
import vn.fis.traning.entity.Customer;
import vn.fis.traning.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<?> add(@RequestBody Category category){
		return  ResponseEntity.ok(categoryService.addCategory(category));
	}
	
	@PostMapping("/checkOne")
	@ResponseBody
	public ResponseEntity<?> checkOne(@RequestBody DateBetweenForOneCat dateBetweenForOneCat){
		return ResponseEntity.ok(categoryService.checkOneCategory(dateBetweenForOneCat.getStartDate(), dateBetweenForOneCat.getEndDate(),dateBetweenForOneCat.getCategory()));
	}
	@PostMapping("/checkAll")
	@ResponseBody
	public ResponseEntity<?> checkAll(@RequestBody DateBetweenForOneCat dateBetweenForOneCat){
		return ResponseEntity.ok(categoryService.checkAllCategory(dateBetweenForOneCat.getStartDate(), dateBetweenForOneCat.getEndDate()));
	}
}
