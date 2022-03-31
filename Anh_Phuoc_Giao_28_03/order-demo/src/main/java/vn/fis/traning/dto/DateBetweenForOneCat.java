package vn.fis.traning.dto;

import java.util.Date;

import lombok.Data;
import vn.fis.traning.entity.Category;
import vn.fis.traning.entity.Product;
@Data
public class DateBetweenForOneCat {
	public Date startDate;
	public Date endDate;
	public Category category;
}
