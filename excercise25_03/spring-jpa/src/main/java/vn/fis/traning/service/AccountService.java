package vn.fis.traning.service;

import java.util.List;

import vn.fis.traning.entity.Account;

public interface AccountService {
	Account save (Account account);
	Account update (Account acount);
	void delete(Long accountId);
	Account getById(Long acountID);
	List<Account> getByFullname(String fullname);
}
