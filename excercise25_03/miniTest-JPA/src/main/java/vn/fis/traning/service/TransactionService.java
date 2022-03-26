package vn.fis.traning.service;

import vn.fis.traning.entity.Account;
import vn.fis.traning.entity.Transaction;

public interface TransactionService {
	Transaction chuyenTien(Account fromAccount,Account toAccount,Integer amount);

}
