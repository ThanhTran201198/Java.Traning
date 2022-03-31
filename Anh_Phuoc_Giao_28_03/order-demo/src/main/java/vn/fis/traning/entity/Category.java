package vn.fis.traning.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
@Entity
@Data
public class Category implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;
	private String name;
//	@OneToMany(cascade = CascadeType.ALL, fetch= FetchType.LAZY)
//	@JoinColumn(name = "categoryId",referencedColumnName="categoryId")
//	private List<Product> lstProduct;	
//	
	
}
