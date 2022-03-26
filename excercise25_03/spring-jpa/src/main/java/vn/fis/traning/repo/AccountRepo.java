package vn.fis.traning.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.fis.traning.dao.AccountDao;
import vn.fis.traning.entity.Account;
@Repository
public interface AccountRepo extends CrudRepository<Account, Long>,AccountDao{
}
