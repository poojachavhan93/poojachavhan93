package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

      /*  Flight flight = new Flight();
        flight.flightNumber = "2445";
        flight.airline= "AIR INDIA";
        System.out.println(flight.flightNumber);
        System.ot.println(flight.airline);

        Address ad = new Address();
        ad.street="dd";
        ad.city="BN";
        ad.state="KA";
        System.out.println(ad.getAddressDetails());
*/
        Contact c = new Contact();

        Scanner sc= new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        Ticket t= new Ticket();
        TouristTicket tt = new TouristTicket();
        RegularTicket rt = new RegularTicket();
        rt.pnr = "J13P9";
        tt.pnr = "F54H6";
        System.out.println("WELCOME to Indian Airline Reservation System!!");
        System.out.println("Name:");
        c.name=sc.nextLine();
        System.out.println("Contact Number:");
        c.phone =sc.nextLine();
        System.out.println("Email:");
        c.email=sc.next();
        System.out.println("Address Details:-");
        System.out.println("Street:");
        Address a = new Address();
        a.street =sc2.nextLine();
        System.out.println("City:");
        a.city=sc.next();
        System.out.println("State:");
        a.state =sc2.nextLine();
        System.out.println("Please enter your departure location and destination location:");
        System.out.println("From:");
        t.departureDateTime=sc2.next();
        System.out.println("To:");
        t.arrivalDateTime=sc2.next();
        System.out.println("We have 2 available airlines");
        System.out.println("Type in one out of Indigo and British");
        Flight f=new Flight();

        f.flightNumber = "2445";
       f.capacity = 80;
       f.bookedSeats = 50;
        f.airline=sc2.next();
        System.out.println("Thanks for selecting: "+f.airline+" Airlines");
        System.out.println();
        System.out.println("| Flight no: "+f.flightNumber+"  |  Capacity: "+f.capacity+"  |  BookedSeats: "+f.bookedSeats);
        System.out.println();
        System.out.println(" PNR: " + rt.pnr );


    }
}
