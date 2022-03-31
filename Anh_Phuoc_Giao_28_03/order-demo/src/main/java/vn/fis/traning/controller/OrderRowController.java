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

import vn.fis.traning.dto.DateBetwennDto;
import vn.fis.traning.dto.OrderDto;
import vn.fis.traning.entity.Customer;
import vn.fis.traning.service.CustomerService;
import vn.fis.traning.service.OrderRowService;

@RestController
@RequestMapping("/orderRow")
public class OrderRowController {
	@Autowired
	OrderRowService orderRowService;
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/check1")
	@ResponseBody
	public ResponseEntity<?> check1(@RequestBody DateBetwennDto dateBetwennDto){
		return ResponseEntity.ok(orderRowService.check1(dateBetwennDto.getStartDate(), dateBetwennDto.getEndDate(),dateBetwennDto.getProduct()));
	}
	@PostMapping("/check2")
	@ResponseBody
	public ResponseEntity<?> check2(@RequestBody DateBetwennDto dateBetwennDto){
		return ResponseEntity.ok(orderRowService.check2(dateBetwennDto.getStartDate(), dateBetwennDto.getEndDate(),dateBetwennDto.getProduct()));
	}

	
}
