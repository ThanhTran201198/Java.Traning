package fis.java.topic01.practice02;

import java.util.ArrayList;

public class Summary {
	private ArrayList<BicycleTicket> bicycleTickets=new ArrayList<BicycleTicket>();
	private ArrayList<MotorbikeTicket> motorbikeTickets=new ArrayList<MotorbikeTicket>();
	
	public void addBicycleTickets(BicycleTicket bicycleTicket) {
		bicycleTickets.add(bicycleTicket);
	}
	public void addMotorbikeTickets(MotorbikeTicket motorbikeTicket) {
		motorbikeTickets.add(motorbikeTicket);
	}
	public int total() {
		return bicycleTickets.size()+motorbikeTickets.size();
	}
	public double totalMoney() {
		return bicycleTickets.size()*500 + motorbikeTickets.size()*1000;
	}
	public double interest() {
		return this.totalMoney()*0.9-this.total()*100;
	}
	
}
