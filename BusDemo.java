package training;
import  java.util.*;
import java.util.ArrayList;
public class BusDemo {
	public static void main(String[]args) {
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,3));
		buses.add(new Bus(2,false,2));
		buses.add(new Bus(3,true,10));
		
		int userOp =1;
		Scanner sc = new Scanner(System.in);
		
		for(Bus b :buses) {
			b.displayBusInfo();
		}
		while(userOp==1) {
		 System.out.println("Enter 1 to Book and 2 to Exit");
		 userOp=sc.nextInt();
		 if(userOp==1) {
			 Booking booking = new Booking();
			 if(booking.isAvailable(bookings,buses)) {
				 bookings.add(booking);
				 System.out.println("your booki is successfull");
				 }
			 else {
				 System.out.println("sorry! your bookimg is not successfull.Bus is full");
			 }
			// System.out.println("Booking.....");
		 }
		 else if(userOp==2) {
			 System.out.println("Exit");
		 }
	}
		

	}}
