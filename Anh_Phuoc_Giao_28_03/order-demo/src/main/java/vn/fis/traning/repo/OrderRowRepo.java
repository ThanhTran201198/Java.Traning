package vn.fis.traning.repo;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import vn.fis.traning.entity.OrderRow;
import vn.fis.traning.entity.Product;

public interface OrderRowRepo extends JpaRepository<OrderRow, Long>{
//	@Modifying
//    @Transactional
//    @Query("select d from order_row d where d.createdDate >= :from and d.createdDate <= :to ")
//    List<OrderRow> findByCreatedDateBetween(@Param("from") Date from, @Param("to") Date to);
	List<OrderRow> findByCreateDateBetween(Date start, Date end);
	List<OrderRow> findByCreateDateBetweenAndProduct(Date start, Date end,Product product);
}
