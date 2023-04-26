package com.ticket.mock;

import java.time.LocalDate;

public class Ticket {
	//getters,setters, constructor etc
	private String ticketId;
	private String Priority;
	private String phone;
	private LocalDate Date;
	
	public Ticket(String ticketId, String Priority, String phone, LocalDate Date) {
		this.ticketId = ticketId;
		this.Priority = Priority;
		this.phone = phone;
		this.Date = Date;
	}
	
	public String getTicketId() {
		return ticketId;
	}
	
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	
	public String getPriority() {
		return Priority;
	}
	
	public void setPriority(String priority) {
		this.Priority = priority;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public LocalDate getDate() {
		return Date;
	}
	
	public void setDate(LocalDate date) {
		this.Date = date;
	}
}
