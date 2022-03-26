package vn.fis.traning.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
@Entity
@Table(name="account")
public class Account implements Serializable{
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("account_id")
	@Column(name="account_id")
	private Long accountId;
	
	@JsonProperty("account_no")
	@Column(name="account_no")
	private String accountNo;
	
	@Column(name="card_no")
	private String cardNo;
	
	@Column(name="fullname")
	private String fullname;
	
	@Column(name="amount")
	private Long amount;
	
	@JsonProperty("issued_date")
	@Column(name="issued_date")
	private Date issuedDate;
	
	@JsonProperty("update_date")
	@Column(name="update_date")
	private Date updateDate;
	
}
