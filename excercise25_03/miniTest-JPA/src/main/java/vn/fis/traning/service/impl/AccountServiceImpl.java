package vn.fis.traning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import vn.fis.traning.entity.Account;
import vn.fis.traning.repo.AccountRepo;
import vn.fis.traning.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	AccountRepo accountRepo;
	
	@Override
	public Account addAccount(Account account) {
		List<Account> list=accountRepo.findByAccountNumber(account.getAccountNumber());
		if(list.size()!=0) {
			return null;
		}
		if(account.getAccountNumber().length()!=12) {
			return null;
		}
		if(account.getAccountName().length()<=5||account.getAccountName().length()>=100) {
			return null;
		}
		account.setBalance(100000.0);
		account.setStatus(1);
		return accountRepo.save(account);
		
	}

	@Override
	public Account updateAccount(Account account) {
		Account kq=accountRepo.findById(account.getAccountId()).orElse(null);
//		List<Account> list=accountRepo.findByAccountNumber(kq.getAccountNumber());
//		if(list.size()==0) {
//			return null;
//		}
//		if(account.getAccountName().length()<=5||account.getAccountName().length()>=100) {
//			return null;
//		}
//		if(account.getStatus()!=0&&account.getStatus()!=1&&account.getStatus()!=2) {
//			return null;
//		}
		kq.setAccountName(account.getAccountName());
		kq.setStatus(account.getStatus());
		return accountRepo.save(kq);
	}

	@Override
	public String deleteAccount(Long acconutId) {
		if(accountRepo.findById(acconutId)!=null) {
			accountRepo.deleteById(acconutId);
			return "Xóa thành công ^_^";
		}
		return "Tài khoản không hợp lệ!";
	}

	@Override
	public List<Account> findAllAccount() {
		return (List<Account>) accountRepo.findAll();
	}

	@Override
	public Account findById(Long accountId) {
		return  accountRepo.findById(accountId).orElse(null);
	}



}
