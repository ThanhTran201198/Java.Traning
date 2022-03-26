package vn.fis.traning.repo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import vn.fis.traning.entity.Account;

public interface AccountRepo extends CrudRepository<Account,Long>{
	List<Account> findByAccountNumber(String accountNumber);
}
