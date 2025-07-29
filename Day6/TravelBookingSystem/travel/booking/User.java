package TravelBookingSystem.travel.booking;

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
    }
}
