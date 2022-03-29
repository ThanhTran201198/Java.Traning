package vn.fis.traning.service.impl;

	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.fis.traning.entity.Customer;
import vn.fis.traning.entity.OrderProduct;
import vn.fis.traning.entity.OrderRow;
import vn.fis.traning.entity.Product;
import vn.fis.traning.repo.CustomerRepo;
import vn.fis.traning.repo.OrderProductRepo;
import vn.fis.traning.repo.ProductRepo;
import vn.fis.traning.service.OrderProductService;
@Service
public class OrderProductServiceImpl implements OrderProductService{
	@Autowired
	OrderProductRepo orderProductRepo;
	
	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	ProductRepo productRepo;
	@Override
	public OrderProduct addOrderProduct(OrderProduct orderProduct) {
		if(orderProduct.getOrderId()!=null) return null;
		Customer 	customer=customerRepo.findByUsername(orderProduct.getCustomer().getUsername());
		if(customer==null) return null;
		List<OrderRow> lst=orderProduct.getLstOrderRow();
		Double totalPrice=0.0;
		for(OrderRow orderRow:lst) {
			Product product=productRepo.findByName(orderRow.getProduct().getName());
			if(product==null) return null;
			orderRow.setProduct(product);
			totalPrice+=product.getPrice()*orderRow.getNumber();
		}
		orderProduct.setLstOrderRow(lst);
		orderProduct.setTotalPrice(totalPrice);
		orderProduct.setCustomer(customer);
		orderProduct.setCreateDate(new Date());
		return orderProductRepo.save(orderProduct);
	}

	@Override
	public OrderProduct updateOrderProduct(OrderProduct orderProduct) {
		if(orderProduct.getOrderId()==null) return null;
		Customer customer=customerRepo.findByUsername(orderProduct.getCustomer().getUsername());
		if(customer==null) return null;
		List<OrderRow> lst=orderProduct.getLstOrderRow();
		Double totalPrice=0.0;
		for(OrderRow orderRow:lst) {
			Product product=productRepo.findByName(orderRow.getProduct().getName());
			if(product==null) return null;
			orderRow.setProduct(product);
			totalPrice+=product.getPrice()*orderRow.getNumber();
		}
		orderProduct.setLstOrderRow(lst);
		orderProduct.setTotalPrice(totalPrice);
		orderProduct.setCustomer(customer);
		orderProduct.setCreateDate(new Date());
		return orderProductRepo.save(orderProduct);
	}

	@Override
	public void deleteOrderProduct(Long orderProductId) {
		orderProductRepo.deleteById(orderProductId);
	}

}
