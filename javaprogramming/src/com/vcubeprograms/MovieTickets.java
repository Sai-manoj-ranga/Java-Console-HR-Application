package com.vcubeprograms;
import java.util.*;
public class MovieTickets {
	static String treatreName="RSM Multiplex";
	String movieName;
	int seatNumber;
	boolean booked;
	void bookTicket() {
		booked=true;
		System.out.println("____________________________");
		System.out.println("|  "+treatreName         );
		System.out.println("|  "+seatNumber+"  "+movieName);
		System.out.println("|  " +booked);	
		System.out.println("____________________________");

	}
	void cancelTicket() {
		booked =false;
		System.out.println(seatNumber+" seat Ticket cancelled "+"   ticket available->"+booked );
	}
	void showDetails() {
		bookTicket();	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTickets m=new MovieTickets();
		Scanner sc=new Scanner(System.in);
		m.movieName=sc.next();
		m.seatNumber=sc.nextInt();
		m.showDetails();
		MovieTickets mo=new MovieTickets();
		mo.movieName=sc.next();
		mo.seatNumber=sc.nextInt();
		mo.cancelTicket();
	}

}
