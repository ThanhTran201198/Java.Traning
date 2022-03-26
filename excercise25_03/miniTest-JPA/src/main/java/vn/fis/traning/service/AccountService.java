package vn.fis.traning.service;

import java.util.List;

import vn.fis.traning.entity.Account;

public interface AccountService {
	Account addAccount(Account account);
	Account updateAccount(Account account);
	void deleteAccount(Long acconutId);
	Account findById(Long accountId);
	List<Account> findAllAccount();
}
