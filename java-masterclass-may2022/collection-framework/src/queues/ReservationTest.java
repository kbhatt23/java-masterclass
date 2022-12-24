package queues;

public class ReservationTest {

	public static void main(String[] args) {
		TicketReservation res=  new TicketReservation();
		
		for(int i = 0 ; i <14; i++) {
		System.out.println(res.bookFlight("ka: "+i, "cha: "+i, i * 10, "first", "male", "num-"+i));
		}
	}
}
