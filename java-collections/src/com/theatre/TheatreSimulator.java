package com.theatre;

import java.util.Scanner;

public class TheatreSimulator {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Ram bhakt Theatere");
		boolean quit = false;
		Theatre theatre = new Theatre("Rambhakt", 3, 4);
		while (!quit) {
			displayOptions();
			if(scanner.hasNextInt()) {
				int option = scanner.nextInt();
				switch (option) {
				case 1:
					theatre.printSeats();
					break;
				case 2:
					bookSeat(theatre);
					break;
				case 3:
					cancelBooking(theatre);
					break;
				case 4:
					System.out.println("jai shree ram for comming to theatre");
					quit=true;
					break;

				default:
					break;
				}
				
			}else {
				System.err.println("Please choose correct option");
			}
			scanner.nextLine();
		}
		
		scanner.close();
	}

	private static void cancelBooking(Theatre theatre) {
		System.out.println("Please type the seat number");
		String seatNumber = scanner.next();
		theatre.cancelSeat(seatNumber);
	}

	private static void bookSeat(Theatre theatre) {
		System.out.println("Please type the seat number");
		String seatNumber = scanner.next();
		theatre.bookSeat(seatNumber);
	}
		

	private static void displayOptions() {
		System.out.println("Please choose 1 to display all seats");
		System.out.println("Please choose 2 to book seat");
		System.out.println("Please choose 3 to cancel seat");
		System.out.println("Please choose 4 to quit");
		System.out.println("Please choose 0 to display all options");
	}
}
