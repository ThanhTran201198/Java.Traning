package vn.fis.traning.service.impl;

import java.util.Date;
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
	public Account save(Account account) {
		//Validate accountNo chưa tồn tại thì mới tạo mới
		account.setIssuedDate(new Date());
		return accountRepo.save(account);
	}

	@Override
	public Account update(Account account) {
		//Validate accountNo phải tồn tại rồi mới cho update
		account.setIssuedDate(new Date());
		Account account1 = accountRepo.save(account);
		// Lưu lịch sử cập nhật trên bảng account_history
		return account1;
	}

	@Override
	public void delete(Long accountId) {
		accountRepo.deleteById(accountId);
		
	}

	@Override
	public Account getById(Long acountID) {
		return accountRepo.findById(acountID).orElse(null);
	}

	@Override
	public List<Account> getByFullname(String fullname) {
		// TODO Auto-generated method stub
		return accountRepo.getByFullname(fullname);
	}
	
}
