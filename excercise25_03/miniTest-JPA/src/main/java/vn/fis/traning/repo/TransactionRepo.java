package vn.fis.traning.repo;



import org.springframework.data.repository.CrudRepository;

import vn.fis.traning.entity.Transaction;


public interface TransactionRepo extends CrudRepository<Transaction,Long>{
	
}
