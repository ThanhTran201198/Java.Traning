package vn.fis.traning.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long productId;
	
	private String name;
	private Double price;
	private String 	description ;
//	Dùnng describe thì bị lỗi
//	private String 	describe ;

}
