package vn.fis.wallet.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
public class AccountDto {
	@JsonProperty("account_id")
	private Long accountId;
	
	@JsonProperty("account_no")
	private String accountNo;
	
	@JsonProperty("card_no")
	private String cardNo;
	
	private String fullname;
	
	private Long amount;
	
	@JsonProperty("issued_date")
	private Date issuedDate;
	
	@JsonProperty("update_date")
	private Date updateDate;
}
