package vn.fis.traning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import vn.fis.traning.dto.OrderDto;
import vn.fis.traning.entity.OrderProduct;
import vn.fis.traning.service.OrderProductService;

@RestController
@RequestMapping("/order")
public class OrderProductController {
	@Autowired
	OrderProductService orderProductService;
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<?> add(@RequestBody OrderProduct orderProduct){
//		OrderProduct orderProduct=new OrderProduct(orderDto.getCustomer(), null, null);
		return  ResponseEntity.ok(orderProductService.addOrderProduct(orderProduct));
	}
	
}
