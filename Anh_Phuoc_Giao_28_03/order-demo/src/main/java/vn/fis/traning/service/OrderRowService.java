package vn.fis.traning.service;

import java.util.Date;
import java.util.List;

import vn.fis.traning.entity.OrderRow;
import vn.fis.traning.entity.Product;

public interface OrderRowService {
	List<OrderRow> check1(Date date1,Date date2,Product product);
	List<OrderRow> check2(Date date1,Date date2,Product product);
}
