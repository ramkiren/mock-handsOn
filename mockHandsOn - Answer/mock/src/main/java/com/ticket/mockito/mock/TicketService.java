package com.ticket.mockito.mock;

public class TicketService  {
	
	private TicketRepository ticketRepository;
	
	public TicketService(TicketRepository ticketRepository) {
		this.ticketRepository = ticketRepository;
	}
	
	public void addTicket(Ticket ticket){

		ticketRepository.save(ticket);
	}
	
}
