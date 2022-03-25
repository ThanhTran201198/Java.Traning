package vn.fis.traning.dao;

import java.util.List;

import vn.fis.traning.entity.Account;

public interface AccountDao {
	List<Account> getByFullname(String fullname);
}
