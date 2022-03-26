package vn.fis.traning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.fis.traning.entity.Account;
import vn.fis.traning.repo.AccountRepo;
import vn.fis.traning.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	AccountRepo accountRepo;
	
	@Override
	public Account addAccount(Account account) {
		return accountRepo.save(account);
	}

	@Override
	public Account updateAccount(Account account) {
		return accountRepo.save(account);
	}

	@Override
	public void deleteAccount(Long acconutId) {
		accountRepo.deleteById(acconutId);
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
