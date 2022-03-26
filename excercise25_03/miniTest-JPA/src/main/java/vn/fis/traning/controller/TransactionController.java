package vn.fis.traning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import vn.fis.traning.dto.ChuyenTienDto;
import vn.fis.traning.entity.Account;
import vn.fis.traning.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired
	TransactionService transactionService;
	@PostMapping("/chuyenTien")
	@ResponseBody
	public ResponseEntity<?> chuyenTien(@RequestBody ChuyenTienDto chuyenTienDto){
		return  ResponseEntity.ok(transactionService.chuyenTien(chuyenTienDto));
	}
}
