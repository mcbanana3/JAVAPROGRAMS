package PACKAGEJAVA;

import java.util.Scanner;

public class Ticketdemo {
	
	static int totalSeatsBooked = 0, totalTicketsBooked = 0;
	
	public static void main(String[] argv) {
		boolean shouldRun = true;
		while(shouldRun) {
			System.out.println("Enter 0 to Exit or Press 1 to Book : ");
			Scanner choic = new Scanner(System.in);
			int choice = choic.nextInt();
			switch(choice) {
				case 0:
					shouldRun = false;
					break;
					
				case 1:
					System.out.println("Enter the Ticket ID : ");
					Scanner TickID = new Scanner(System.in);
					int TicketID = TickID.nextInt();
					System.out.println("Enter the Number of Seats : ");
					Scanner NoTicks = new Scanner(System.in);
					int No_Seats = NoTicks.nextInt();
					System.out.println("Enter the Date : ");
					Scanner Dat = new Scanner(System.in);
					int date = Dat.nextInt();
					System.out.println("Enter the Fare : ");
					Scanner Far = new Scanner(System.in);
					double fare = Far.nextDouble();
					Ticketdemo.totalSeatsBooked = Ticketdemo.totalSeatsBooked + No_Seats;
					Ticketdemo.totalTicketsBooked++;
					System.out.println("The total Seats booked are : "+Ticketdemo.totalSeatsBooked+" and the total Tickets Booked are : "+Ticketdemo.totalTicketsBooked);
					break;
					
				default:
					System.out.println("Enter correct Choice : ");
					break;
			}
		}
	}
}
