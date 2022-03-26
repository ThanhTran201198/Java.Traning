package vn.fis.traning.entity;

import java.util.Date;

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
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transactionId;
	private Date transactionDate;
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "fronmAccount",referencedColumnName="accountId")
//	private Account fronmAccount;
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "toAccount",referencedColumnName="accountId")
//	private Account toAccount;
	private Double amount;
	private Integer status;
	private String content;
	private String errorReason;
}
