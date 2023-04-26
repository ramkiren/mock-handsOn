package com.ticket.mockito.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketRepositoryMock implements TicketRepository {
	
	int saveCalled = 0;
	Ticket lastAddedTicket = null;
	
	@Override
	public void save(Ticket ticket) {
		saveCalled++;
		lastAddedTicket = ticket;
	}
	
	public void verify(Ticket ticket, int times){
		assertEquals(times, saveCalled);
		assertEquals(ticket, lastAddedTicket);
	}
	
}
