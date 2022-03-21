package fis.java.topic01.practice02;

public class BicycleTicket extends Ticket{
	public BicycleTicket(int ticketNumber) {
		super(ticketNumber);
	}
	@Override
	public double tienVe(){
		return Constant.PRICE.XE_DAP;
	}
	@Override
	public double tienThu() {
		return 0.9*Constant.PRICE.XE_DAP-100;
	}
	
}
