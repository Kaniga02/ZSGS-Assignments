package TravelBookingSystem.travel.booking;

public class Ticket {
    private int ticketId;
    private String designation;
    private double fare;

    
    public Ticket(int tId,String design,double amount)
    {
        ticketId = tId;
        designation = design;
        fare = amount;
    }

    public void displayTicket()
    {
        System.out.println("Ticket Id : "+ticketId );
        System.out.println("Designation : "+designation);
        System.out.println("Fare  : "+fare);
    }
    
}
