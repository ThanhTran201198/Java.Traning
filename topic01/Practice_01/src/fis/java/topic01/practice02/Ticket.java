package fis.java.topic01.practice02;

public abstract class Ticket {
	protected int ticketNumber;
	protected double price;
	public Ticket() {
		super();
	}
	public Ticket(int ticketNumber) {
		super();
		this.ticketNumber = ticketNumber;
	}
	public abstract double tienVe();
	public abstract double tienThu();
}
