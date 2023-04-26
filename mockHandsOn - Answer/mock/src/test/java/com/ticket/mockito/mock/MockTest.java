package com.ticket.mockito.mock;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockTest {
	
	@Test
	public void demoMock(){
		TicketRepositoryMock bookRepositoryMock = new TicketRepositoryMock();
		TicketService ticketService = new TicketService(bookRepositoryMock);
		
		Ticket ticket1 = new Ticket("1234", "Mockito In Action", "500", LocalDate.now());
		Ticket ticket2 = new Ticket("1235", "JUnit 5 In Action", "400", LocalDate.now());
		
		ticketService.addTicket(ticket1);
		ticketService.addTicket(ticket2);
		
		bookRepositoryMock.verify(ticket2, 2);
		
	}
	

	
}
