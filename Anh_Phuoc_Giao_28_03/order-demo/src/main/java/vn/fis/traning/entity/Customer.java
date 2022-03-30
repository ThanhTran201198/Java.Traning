package vn.fis.traning.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customer implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;
//	@Column(unique = true)
	private String username;
	private String address;
	private String phone;
	
	
	public Customer(String username, String address, String phone) {
		super();
		this.username = username;
		this.address = address;
		this.phone = phone;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
