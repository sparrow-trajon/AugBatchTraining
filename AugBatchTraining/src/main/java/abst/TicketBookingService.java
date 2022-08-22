package abst;

public abstract class TicketBookingService {
	
	public void book(int noOfTickets) {
		
		System.out.println("noOfTickets have been booked.!!");
	}
	
	
	public abstract void cancelBooking();

}
