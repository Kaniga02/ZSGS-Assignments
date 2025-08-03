package TravelBookingSystem.travel.user;

import TravelBookingSystem.travel.booking.Ticket;

public class User {
    private String name;
    private int age;

    public User(String uname,int uage)
    {
        name = uname;
        age = uage;
    }
    
    public void bookTicket()
    {
        System.out.println("Booking Ticket for "+name);
         Ticket t = new Ticket(12345, "Chennai", 600.00);
        t.displayTicket();
    }
}
