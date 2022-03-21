package fis.java.topic01.practice02;

import java.util.ArrayList;
import java.util.List;

public class Summary {
	private List<Ticket> Tickets=new ArrayList<Ticket>();
	
	public void addTicket(Ticket ticket) {
		Tickets.add(ticket);
	}
	public int tongSoXe() {
		return Tickets.size();
	}
	public double tongTien() {
		double tien= 0;
		for(Ticket t:Tickets) tien+=t.tienVe();
		return tien;
	}
	public double tongTienThu() {
		double tien= 0;
		for(Ticket t:Tickets) tien+=t.tienThu();
		return tien;
	}
	
}
