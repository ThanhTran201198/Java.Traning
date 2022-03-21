package fis.java.topic01.practice02;

public abstract class Ticket {
	protected int ticketNumber;

	public Ticket() {
		super();
	}

	public Ticket(int ticketNumber) {
		super();
		this.ticketNumber = ticketNumber;
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	
}
