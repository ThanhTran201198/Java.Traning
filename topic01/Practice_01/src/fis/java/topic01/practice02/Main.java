package fis.java.topic01.practice02;

public class Main {
	public static void main(String[] args) {
		BicycleTicket b1 =new BicycleTicket(1);
		MotorbikeTicket m1=new MotorbikeTicket(2,"2");
		MotorbikeTicket m2=new MotorbikeTicket(3,"3");
		Summary s=new Summary();
		s.addTicket(b1);
		s.addTicket(m1);
		s.addTicket(m2);
		System.out.println("Tong so xe : "+s.tongSoXe());
		System.out.println("Tong tien ve : "+s.tongTien());
		System.out.println("TOn tien thu duoc : "+s.tongTienThu());
	}
}
