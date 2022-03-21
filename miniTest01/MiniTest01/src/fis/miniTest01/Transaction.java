package fis.miniTest01;

import java.util.Date;

public class Transaction implements Comparable<Transaction>{
	private long Id;
	private Date date;
	private long fromAccount;
	private long toAccount;
	private double amount;
	private int status;
	private String content;
	private String errorReason;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(long id, Date date, long fromAccount, long toAccount, double amount, int status, String content,
			String errorReason) {
		super();
		Id = id;
		this.date = date;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.status = status;
		this.content = content;
		this.errorReason = errorReason;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(long fromAccount) {
		this.fromAccount = fromAccount;
	}
	public long getToAccount() {
		return toAccount;
	}
	public void setToAccount(long toAccount) {
		this.toAccount = toAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getErrorReason() {
		return errorReason;
	}
	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}
	@Override
	public int compareTo(Transaction o) {
		return (int) (o.getId()-this.getId());
	}
	
}
