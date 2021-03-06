package fis.miniTest01;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main extends Thread{
	public static void main(String[] args) {
		Account a1=new Account(1, "Nguyen Van B", "123456789123", 10000, 1);
		Account a2=new Account(5, "Nguyen Van A", "123456789124", 10000, 1);
		Account a3=new Account(3, "Nguyen Van D", "123456789125", 10000, 0);
		Transaction t1=new Transaction(1,new Date(),1,3,1000,1,"a","Chuyen tien thanh cong");
		QuanLyAccount qLA1= new QuanLyAccount();
		qLA1.addList(a1);
		qLA1.addList(a2);
		qLA1.addList(a3);
		qLA1.addListTransaction(t1);
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		String kt;
		String t = null,name,number,number2,noiDung,traLoi;
		long id;
		double soTien;
		int tt;
		Thread thread =new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int dem=0;
				while(true) {
					List<Transaction> listTran=qLA1.getDsTransactions();
					if(dem<listTran.size()) {
						for(int i=dem;i<qLA1.getDsTransactions().size();i++) {
							Transaction tran=listTran.get(i);
							System.out.println(qLA1.thongBao(tran.getFromAccount(), "tru", tran.getAmount(), tran.getDate()));
							System.out.println(qLA1.thongBao(tran.getToAccount(), "cong", tran.getAmount(), tran.getDate()));
						}
						
						dem=qLA1.getDsTransactions().size();
					}
					try {
						sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		thread.start();
		while(true) {
			showMenu();
			t=sc.nextLine();
			switch (t) {
			case "1": {
				System.out.println(qLA1.getList());
				break;
			}
			case "2": {
				System.out.println("Nhap ten tai khoa : ");
				name=sc.nextLine();
				System.out.println("Nhap so tai khoa : ");
				number=sc.nextLine();
				kt=qLA1.taoAccount(name, number);
				System.out.println(kt);
				break;
			}
			case "3": {
				System.out.println("Nhap id : ");
				while(true) {
					id=sc.nextLong();
					if(qLA1.kiemTraID(id)) {
						System.out.println("Nhap ten tai khoa : ");
						name=sc1.nextLine();
						System.out.println("Nhap trang thai : ");
						tt=sc.nextInt();
						kt =qLA1.capNhatAccount(id, name, tt);
						System.out.println(kt);
						if(kt.equals("Cap nhat thanh cong")) break;
						
					}
					System.out.println("Nhap sai ID yeu cau nhap lai : ");
				}
				break;
			}
			case "4": {
				System.out.println("Nhap id : ");
				while(true) {
					id=sc.nextLong();
					if(qLA1.kiemTraID(id)) {
						qLA1.xoaAccount(id);
						break;
					}
					System.out.println("Nhap sai ID yeu cau nhap lai : ");
				}	
				break;
			}
			case "5": {
				System.out.println("Chuyen tien tu STK : ");
				number=sc.nextLine();
				System.out.println("Chuyen tien den STK : ");
				number2=sc.nextLine();
				System.out.println("So tien chuyen khoan : ");
				soTien=sc1.nextDouble();
				System.out.println("Noi dung chuyen khoan : ");
				noiDung=sc.nextLine();
				System.out.println("Ban thuc su muon thuc hien giao dich Y/N ");
				traLoi=sc.nextLine();
				if(traLoi.equals("N")) break;
				else if(traLoi.equals("Y")) {
					System.out.println(qLA1.chuyenKhoan(number, number2, soTien,noiDung));
				}
				
				break;
			}
			case "6": {
				System.out.println(qLA1.getListTransaction());
				break;
			}
			case "7": {
				System.exit(0);
				break;
			}
			default:
				System.out.println("Khong co chuc nang nay");
				break;
			}
			if(t=="7") break;
	}
				

	}
	public static void showMenu() {
        System.out.println("======HE THONG QUAN LY TAI KHOAN======");
        System.out.println("1.Danh Sach Tai Khoan");
        System.out.println("2.Them Moi Tai Khoan");
        System.out.println("3.Cap Nhat Thong Tin Tai Khoan");
        System.out.println("4.Xoa Tai Khoan");
        System.out.println("5.Chuyen Khoan");
        System.out.println("6.Danh Sach Giao Dich");
        System.out.println("7.Exit");
        System.out.println("Chon...");
    }
}
