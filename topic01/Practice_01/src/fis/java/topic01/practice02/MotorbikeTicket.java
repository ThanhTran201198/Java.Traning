package fis.java.topic01.practice02;

public class MotorbikeTicket extends Ticket {
	private String IDMotorbike;
	public MotorbikeTicket() {
		super();
	}
	public MotorbikeTicket(int ticketNumber,String iDMotorbike) {
		super(ticketNumber);
		IDMotorbike = iDMotorbike;
	}
	@Override
	public double tienVe(){
		return Constant.PRICE.XE_MAY;
	}
	@Override
	public double tienThu() {
		return 0.9*Constant.PRICE.XE_MAY-100;
	}
}
