package vn.fis.traning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.fis.traning.entity.OrderProduct;

public interface OrderProductRepo extends JpaRepository<OrderProduct, Long>{

}
