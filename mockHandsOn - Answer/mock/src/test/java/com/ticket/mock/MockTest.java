package com.ticket.mock;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;



public class MockTest {
	
	@Test
	public void demoMock(){
		TicketRepositoryMock TicketRepositoryMock = new TicketRepositoryMock();
		TicketService ticketService = new TicketService(TicketRepositoryMock);
		
		Ticket ticket1 = new Ticket("1", "high", "987654321", LocalDate.now());
		Ticket ticket2 = new Ticket("2", "medium", "9812345621", LocalDate.now());
		
		ticketService.addTicket(ticket1);
		ticketService.addTicket(ticket2);

		TicketRepositoryMock.verify(ticket2, 2);
		
	}
	

	
}
