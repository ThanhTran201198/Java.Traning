package vn.fis.traning.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class OrderRow implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderRowId;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "orderId",referencedColumnName="orderId")
//	private OrderProduct orderProduct;
	
	@ManyToOne
	@JoinColumn(name = "productId",referencedColumnName="productId")
	private Product product;
	
	private Integer number;
}
