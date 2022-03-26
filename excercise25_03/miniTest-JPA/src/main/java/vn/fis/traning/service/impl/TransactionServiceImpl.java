package vn.fis.traning.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.fis.traning.dto.ChuyenTienDto;
import vn.fis.traning.entity.Account;
import vn.fis.traning.entity.Transaction;
import vn.fis.traning.repo.AccountRepo;
import vn.fis.traning.repo.TransactionRepo;
import vn.fis.traning.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{
	@Autowired
	TransactionRepo transactionRepo;
	
	@Autowired
	AccountRepo accountRepo;

	@Override
	public Transaction chuyenTien(ChuyenTienDto chuyenTienDto) {
		Account fromAccount= accountRepo.findById(chuyenTienDto.getFromAccountId()).orElse(null);
		Account toAccount= accountRepo.findById(chuyenTienDto.getToAccountId()).orElse(null);		
		
		String errorReason=null;
		Integer status=1;
		if(fromAccount.getStatus()!=1) {
			status=0;
			errorReason="Tài khoản nguồn không hợp lệ";
		}else if(toAccount.getStatus()!=1) {
			status=0;
			errorReason="Tài khoản đích không hợp lệ";
		}else if(fromAccount.getBalance()<chuyenTienDto.getAmount()) {
			status=0;
			errorReason="Số dư tài khoản nguồn không đủ";
		}
		Date date=new Date();
		Transaction transaction=new Transaction(date, fromAccount, toAccount, chuyenTienDto.getAmount(), status, chuyenTienDto.getContent(), errorReason);
		if(status==1) {
			fromAccount.setBalance(fromAccount.getBalance()-chuyenTienDto.getAmount());
			toAccount.setBalance(toAccount.getBalance()+chuyenTienDto.getAmount());
			accountRepo.save(fromAccount);
			accountRepo.save(toAccount);
			transactionRepo.save(transaction);
		}
		else {
			transactionRepo.save(transaction);
		}
		
		
		
		
		
		return transaction;
	}


}
