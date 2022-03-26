package vn.fis.traning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Account {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountId;
	private String accountNumber;
	private String accountName;
	private Double balance;
	private Integer status;
}
