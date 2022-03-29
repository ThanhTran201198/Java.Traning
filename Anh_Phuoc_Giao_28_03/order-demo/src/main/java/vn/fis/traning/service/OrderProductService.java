package vn.fis.traning.service;

import vn.fis.traning.entity.OrderProduct;

public interface OrderProductService {
	OrderProduct addOrderProduct(OrderProduct orderProduct);
	OrderProduct updateOrderProduct(OrderProduct orderProduct);
	void deleteOrderProduct(Long orderProductId);
}
