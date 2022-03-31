package vn.fis.traning.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class DoanhThuDto implements Serializable{
	public String name;
	public Double totalMoney;
	public DoanhThuDto(String name, Double totalMoney) {
		super();
		this.name = name;
		this.totalMoney = totalMoney;
	}
	public DoanhThuDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
