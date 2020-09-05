package com.theatre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Theatre {
	// name of theatre will always be same once initialized
	private final String name;
	// very basic and absract
	// private Collection<Seat> seats;
	// binary search is there for list or subtypes only
	private List<Seat> seats;
	

	// each theatre can have diferent rows and different seats per row
	public Theatre(String name, int numOfRows, int seatsPerRow) {
		this.name = name;
		this.seats = new ArrayList<>();
		// this.seats = new TreeSet<>(Comparator.comparing(Seat::getSeatNumber));
		// this.seats = new HashSet<Theatre.Seat>();
		// this.seats = new LinkedHashSet<>();
		double price = 0;
		for (int i = 0; i < numOfRows; i++) {
			char c = (char) ('A' + i);
			//assuming price od nearer rows as chepest
			//and we increate it once we go to next row
			price +=100;
			for (int s = 0; s < seatsPerRow; s++) {
				String seatNumber = new StringBuffer().append(c).append("-").append(s + 1).toString();
				seats.add(new Seat(seatNumber,price));
			}
		}
	}

	public void bookSeat(String seatNumber) {
		Seat seatFetched = findSeatByNumber(seatNumber);
		if (seatFetched == null) {
			System.err.println("Seat Number " + seatNumber + " do not exists in Theatre " + name);
		} else {
			seatFetched.reserveSeat();
		}
	}

	public void cancelSeat(String seatNumber) {
		// for performance using binary sear ch -> O(log n )complexity
		Seat seatFetched = findSeatByNumber(seatNumber);
		if (seatFetched == null) {
			System.err.println("Seat Number " + seatNumber + " do not exists in Theatre " + name);
		} else {
			seatFetched.cancelSeat();
		}
	}

	private Seat findSeatByNumber(String seatNumber) {
		 Seat seatFetched = seats.stream().filter(seat ->
		seat.seatNumber.equals(seatNumber)).findFirst().orElse(null);
		
		//removing binary search as now we would not have price of seat
		//int index = Collections.binarySearch(seats, new Seat(seatNumber), Comparator.comparing(Seat::getSeatNumber));
		//if (index < 0) {
		//	return null;
		//} else {
		//	return seats.get(index);
		//}
		return seatFetched;
	}

	public void printSeats() {
		//adding feature of displaying seats by price
		//first sort by price, for same row elmenet price will be same -> so for those sort by seat number
		seats.stream()
				.sorted(Comparator.comparing(Seat::getPrice).thenComparing(Comparator.comparing(Seat::getSeatNumber)))
				.forEach(seat -> System.out.println("Seat Number: " + seat.seatNumber + " Status: " + seat.reserved+" Price: "+seat.price));
	}

	// can Seat class exist without Theatre at all
	// obviously no -> so good use case for inner class
	// making it private so that no one can hold it
	private class Seat {
		// seat number can not be cahnged -> shud not be otherwise conflict will occur
		private final String seatNumber;
		// default value is false -> no need to put in constructor
		private boolean reserved;
		//price once set for a seat -> can not be cahnged, we shoudl creat enew object of seat with diff price
		private final double price;

		public double getPrice() {
			return price;
		}

		private String getSeatNumber() {
			return seatNumber;
		}

		private Seat(String seatNumber, double price) {
			this.seatNumber = seatNumber;
			this.price=price;
		}

		private boolean reserveSeat() {
			if (!reserved) {
				System.out.println("reserving seat " + seatNumber +" , Please pay "+this.price+" rupees");
				reserved = true;
				return true;
			} else {
				System.err.println("Seat " + seatNumber + " already booked");
				return false;
			}
		}

		private boolean cancelSeat() {
			if (reserved) {
				reserved = false;
				System.out.println("cancelling seat " + seatNumber+" , Please receive "+this.price+" from counter");
				return true;
			} else {
				System.err.println("Seat " + seatNumber + " not already booked");
				return false;
			}
		}

		private Theatre getEnclosingInstance() {
			return Theatre.this;
		}

		// consideringseatnumber is alone unique field
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((seatNumber == null) ? 0 : seatNumber.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Seat other = (Seat) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (seatNumber == null) {
				if (other.seatNumber != null)
					return false;
			} else if (!seatNumber.equals(other.seatNumber))
				return false;
			return true;
		}
	}

}
