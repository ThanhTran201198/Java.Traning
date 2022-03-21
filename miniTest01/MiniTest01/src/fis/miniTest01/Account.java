package fis.miniTest01;

import java.util.Comparator;

public class Account implements Comparable<Account>,Comparator<Account>{
	private long Id;
	private String accountName;
	private String accountNumber;
	private double balance;
	private int status;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(long id, String accountName, String accountNumber, double balance, int status) {
		super();
		Id = id;
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.status = status;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getTrangThai() {
		if(status==0) return "Het Hieu Luc";
		if(status==1) return "Hieu Luc";
		return "Tam Khoa";
	}
	@Override
	public int compareTo(Account o) {
		return this.accountName.compareTo(o.accountName);
	}
	@Override
	public int compare(Account o1, Account o2) {
		return (int) (o2.Id-o1.Id);
	}
	
	
}
