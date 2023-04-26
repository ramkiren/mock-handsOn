package com.ticket.mockito.mock;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockTest {
	
	@Test
	public void demoMock(){
		TicketRepositoryMock bookRepositoryMock = new TicketRepositoryMock();
		TicketService ticketService = new TicketService(bookRepositoryMock);
		
		Ticket ticket1 = new Ticket("1", "high", "987654321", LocalDate.now());
		Ticket ticket2 = new Ticket("2", "medium", "9812345621", LocalDate.now());
		
		ticketService.addTicket(ticket1);
		ticketService.addTicket(ticket2);
		
		bookRepositoryMock.verify(ticket2, 2);
		
	}
	

	
}
