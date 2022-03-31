package vn.fis.traning.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.fis.traning.dto.DoanhThuDto;
import vn.fis.traning.entity.Category;
import vn.fis.traning.entity.OrderRow;
import vn.fis.traning.entity.Product;
import vn.fis.traning.repo.CategoryRepo;
import vn.fis.traning.repo.OrderRowRepo;
import vn.fis.traning.repo.ProductRepo;
import vn.fis.traning.service.CategoryService;
@Service
public class CategoryServiceImple implements CategoryService{
	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	OrderRowRepo orderRowRepo;
	
	@Autowired
	CategoryRepo categoryRepo;
	
	@Override
	public Double checkOneCategory(Date date1, Date date2,Category category) {
		Double sum=0.0;
		List<Product> lstProducts=productRepo.findByCategory(category) ;
		for(Product product:lstProducts) {
			List<OrderRow> lstOrderRows=orderRowRepo.findByCreateDateBetweenAndProduct(date1, date2, product);
			for(OrderRow orderRow:lstOrderRows) {
				sum+=orderRow.getNumber()*product.getPrice();
			}
		}
		return sum;
	}

	@Override
	public Category addCategory(Category category) {
		return categoryRepo.save(category);
	}

	@Override
	public List<DoanhThuDto> checkAllCategory(Date date1, Date date2) {
		List<Category> lstCategories =categoryRepo.findAll();
		List<DoanhThuDto> lst=new ArrayList<>();
		for(Category category:lstCategories) {
			Double money=checkOneCategory(date1, date2, category);
			lst.add(new DoanhThuDto(category.getName(),money));
		}
		return lst;
	}
	
}
