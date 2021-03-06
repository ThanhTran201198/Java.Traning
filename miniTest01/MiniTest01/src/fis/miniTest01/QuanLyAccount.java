package fis.miniTest01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class QuanLyAccount {
	private long Id;
	private List<Account> dsAccounts=new ArrayList<Account>();
	private List<Transaction> dsTransactions=new  ArrayList<Transaction>();
	public QuanLyAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuanLyAccount(long id, List<Account> dsAccounts) {
		super();
		Id = id;
		this.dsAccounts = dsAccounts;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public void addList(Account a) {
		dsAccounts.add(a);
	}
	public void addListTransaction(Transaction a) {
		dsTransactions.add(a);
	}
	
	public List<Transaction> getDsTransactions() {
		return dsTransactions;
	}
	public StringBuilder getList(){
		Collections.sort( dsAccounts);
		StringBuilder s =new StringBuilder(String.format("%-3s %-20s %-12s %-12s %-12s", "ID","Ten Tai Khoan","So Tai Khoan","So Du","Trang Thai")+"\n");
		dsAccounts.stream().forEach(t->s.append(String.format("%-3s %-20s %-12s %-12s %-12s", t.getId(),t.getAccountName(),t.getAccountNumber(),t.getBalance(),t.getTrangThai())+"\n"));
		return s;
	}
	public StringBuilder getListTransaction(){
//		Collections.sort(dsTransactions);
		StringBuilder s =new StringBuilder(String.format("%-3s %-30s %-8s %-8s %-6s %-10s %-25s", "ID","Date","IDChuyen","IDNhan","Status","Noi Dung","Loi")+"\n");
		dsTransactions.stream().forEach(t->s.append(String.format("%-3s %-30s %-8s %-8s %-6s %-10s %-25s", t.getId(),t.getDate(),t.getFromAccount(),t.getToAccount(),t.getStatus(),t.getContent(),t.getErrorReason())+"\n"));
		return s;
	}
	public String kiemTraAccount(String name,String number) {
		if(number.length()!=12) return "So tai khoan phai dai 12 ki tu";
		if(name.length()<=5 || name.length()>=100) return "Ten tai khoan phai > 5 va <100";
//		if(dsAccounts.stream().anyMatch(t->t.getAccountNumber().equals(number))) return "Trung so tai khoan";
		return "Thanh Cong";
	}
	public String taoAccount(String name ,String number) {
		String kt =kiemTraAccount(name, number);
		if(!kt.equals("Thanh Cong")) {
			return kt;
		}
		Collections.sort(dsAccounts,new Account());
		long idMoi=dsAccounts.get(0).getId()+1;
		addList(new Account(idMoi, name, number, 100000, 1));
		return kt;
	}
	public boolean kiemTraID(long s) {
		if(dsAccounts.stream().anyMatch(t->(t.getId()==s))) return true;
		return false;
		
	}
	public String capNhatAccount(long s,String name ,int tt) {
		if(name.length()<=5 || name.length()>=100) return "Ten tai khoan phai > 5 va <100" ;
		if(tt!=0&&tt!=1&&tt!=2) return "Trang thai khong dung";
		for(Account a:dsAccounts) {
			if(s==a.getId()) {
				a.setAccountName(name);
				a.setStatus(tt);
			}
		}
		return "Cap nhat thanh cong";
	}
	public String xoaAccount(long s) {
		for(Account a:dsAccounts) {
			if(a.getId()==s) {
				dsAccounts.remove(a);
			}
		}
		return "Cap nhat thanh cong";
	}
	public boolean kiemTraSTK(String stk) {
		if(dsAccounts.stream().anyMatch(t->(t.getAccountNumber().equals(stk)))) return true;
		return false;
	}
	public boolean kiemTraHieuLucSTK(String stk) {
		for(Account a:dsAccounts) {
			if(a.getAccountNumber().equals(stk)&&a.getStatus()==1) return true;
		}
		return false;
	}
	public boolean kiemTraSoDu(String stk,double soTien) {
		for(Account a:dsAccounts) {
			if(a.getAccountNumber().equals(stk)&&a.getBalance()>=soTien) return true;
		}
		return false;
	}
	public void thayDoiTien(String stk,double soTien) {
		for(Account a:dsAccounts) {
			if(a.getAccountNumber().equals(stk)) {
				a.setBalance(a.getBalance()+soTien);
				return;
			}
		}
	}
	public long convertStkToId(String stk) {
		for(Account a:dsAccounts) {
			if(a.getAccountNumber().equals(stk)) {
				return a.getId();
			}
		}
		return 0;
	}
	public void taoTransaction(String stkChuyen,String stkNhan,double soTien,int tranThai,String noiDung,String tb) {
		Collections.sort(dsTransactions);
		long idMoi=dsTransactions.get(0).getId()+1;
		dsTransactions.add(new Transaction(idMoi, new Date(), convertStkToId(stkChuyen), convertStkToId(stkNhan), soTien, tranThai, noiDung, tb));
	}
	public String chuyenKhoan(String stkChuyen,String stkNhan,double soTien,String noiDung) {
		if(stkChuyen.equals(stkNhan)) return "Hai STK giong nhau";
		if(!kiemTraSTK(stkChuyen)) return "STK chuyen khong hop le";
		if(!kiemTraSTK(stkNhan)) return "STK nhan khong hop le";
		if(!kiemTraHieuLucSTK(stkChuyen)) {
			taoTransaction(stkChuyen, stkNhan, soTien, 0, noiDung,"STK chuyen het hieu luc" );
			return "STK chuyen het hieu luc";
		}
		if(!kiemTraHieuLucSTK(stkNhan)) {
			taoTransaction(stkChuyen, stkNhan, soTien, 0, noiDung,"STK nhan het hieu luc" );
			return "STK nhan het hieu luc";
		}
		if(!kiemTraSoDu(stkChuyen, soTien)) return "So du khong du";
		taoTransaction(stkChuyen, stkNhan, soTien, 1, noiDung,"Chuyen tien thanh cong" );
		thayDoiTien(stkChuyen, -soTien);
		thayDoiTien(stkNhan, soTien);
		return "Chuyen tien thanh cong";
	}
	public String thongBao(long id,String dau,double tien,Date time){
		for(Account a:dsAccounts) {
			if(a.getId()==id) {
				return "TK "+a.getAccountName()+" "+a.getAccountNumber()+" "+dau+" "+tien+" "+time;
			}
		}
		return "";
	}
}
