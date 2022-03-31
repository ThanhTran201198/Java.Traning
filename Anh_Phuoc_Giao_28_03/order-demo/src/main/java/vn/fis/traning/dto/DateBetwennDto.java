package vn.fis.traning.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import vn.fis.traning.entity.Product;
@Data
public class DateBetwennDto implements Serializable{
	public Date startDate;
	public Date endDate;
	public Product product;
}
