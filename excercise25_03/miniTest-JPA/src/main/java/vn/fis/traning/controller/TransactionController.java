package vn.fis.traning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.fis.traning.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired
	TransactionService transactionService;
}
