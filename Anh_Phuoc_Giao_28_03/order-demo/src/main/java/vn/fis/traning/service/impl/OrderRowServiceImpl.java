package vn.fis.traning.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.fis.traning.entity.OrderRow;
import vn.fis.traning.entity.Product;
import vn.fis.traning.repo.OrderRowRepo;
import vn.fis.traning.service.OrderRowService;
@Service
public class OrderRowServiceImpl implements OrderRowService{
	@Autowired
	OrderRowRepo orderRowRepo;
	
	@Override
	public List<OrderRow> check1(Date date1, Date date2,Product product) {
		return orderRowRepo.findByCreateDateBetween(date1, date2);
	}
	public List<OrderRow> check2(Date date1, Date date2,Product product) {
		return orderRowRepo.findByCreateDateBetweenAndProduct(date1, date2,product);
	}

}
