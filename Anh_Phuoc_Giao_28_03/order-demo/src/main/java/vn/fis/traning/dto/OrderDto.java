package vn.fis.traning.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;
import vn.fis.traning.entity.Customer;
import vn.fis.traning.entity.OrderRow;
@Data
public class OrderDto {
	private Customer customer;
	private Date createDate;
	private Double totalPrice;
	private List<OrderRow> lstOrderRow;
}
