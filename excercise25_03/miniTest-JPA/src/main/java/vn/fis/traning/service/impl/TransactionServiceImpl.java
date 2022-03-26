package vn.fis.traning.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.fis.traning.entity.Account;
import vn.fis.traning.entity.Transaction;
import vn.fis.traning.repo.TransactionRepo;
import vn.fis.traning.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{
	@Autowired
	TransactionRepo transactionRepo;

	@Override
	public Transaction chuyenTien(Account fromAccount, Account toAccount, Integer amount) {
	
		return null;
	}


}
