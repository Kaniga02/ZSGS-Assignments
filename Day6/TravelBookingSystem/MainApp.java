/*/*Design a class`Employee with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee. */


package TravelBookingSystem;

import TravelBookingSystem.travel.booking.Ticket;
import TravelBookingSystem.travel.booking.User;


public class MainApp {
    public static void main(String[] args) {
        Ticket t = new Ticket(12345,"Chennai",600.00);
        User u = new User("Kaniga",21);

        
        u.bookTicket();
        t.displayTicket();
    }
    
}

