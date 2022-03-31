package vn.fis.traning.service;

import java.util.Date;
import java.util.List;

import vn.fis.traning.dto.DoanhThuDto;
import vn.fis.traning.entity.Category;

public interface CategoryService {
	Category addCategory(Category category);
	Double checkOneCategory(Date date1, Date date2,Category category);
	List<DoanhThuDto> checkAllCategory(Date date1, Date date2);
}
