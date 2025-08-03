/* Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but implement booking differently.*/

import java.util.Scanner;

public class TicketBookingSysten {
    public static void main(String[] args)
    {
        int k;
        Scanner sc = new Scanner(System.in);
        Booking bus= new Bus();
        Booking train= new Train();
        Booking flight= new Flight();
        do{
            System.out.println("-------------Ticket Booking System-------------- ");
            System.out.println("1. Bus ");
            System.out.println("2. Train ");
            System.out.println("3. Flight");
            System.out.println("4. Available seats");
            System.out.println("Choice Your Option ? ");
            int type = sc.nextInt();
            
           

            if(type==4) {
                System.out.println("\nAvailable Seats");
                    System.out.println("Bus    : "+Booking.busTicket);
                    System.out.println("Train  : "+Booking.TrainTicket);
                    System.out.println("Flight : "+Booking.FlightTicket);
                    
            }

            else {
                

            System.out.println("Enter your Ticket No : ");
            int tno = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your name : ");
            String name = sc.nextLine();
            switch(type) {
                case 1:
                    System.out.println("\n\t\t\t-------------- ..Welcome to SK Travels.. ---------");
                    System.out.println("Total Tickets : "+Booking.busTicket);
                    if(tno>=1 && tno<=Booking.busTicket) {
                        
                        bus.booking(tno,name);
                    }
                    else {
                        System.out.println("Invalid Ticket Number..");
                    }
                    break;
                case 2:
                    System.out.println("\n\t\t\t-------------- ..Welcome to SK Travels.. ---------");
                    System.out.println("Total Tickets : "+Booking.TrainTicket);
                    if(tno>=1 && tno<=Booking.TrainTicket) {
                        
                        train.booking(tno,name);
                    }
                    else {
                        System.out.println("Invalid Ticket Number..");
                    }
                    break;
                case 3:
                    System.out.println("\n\t\t\t-------------- ..Welcome to SK Travels.. ---------");
                    System.out.println("Total Tickets : "+Booking.FlightTicket);
                    if(tno>=1 && tno<=Booking.FlightTicket) {
                        
                        flight.booking(tno,name);
                    }
                    else {
                        System.out.println("Invalid Ticket Number..");
                    }
                    break;
                 default :
                    System.out.println("Invalid Option");
                    break;
            }
        }
            System.out.println("\nDo you Want book Ticket 1-yes 0-No");
            k=sc.nextInt();
        }while(k==1);

        sc.close();
        
    }
   
}

interface Booking {

    int busTicket = 54;
    int TrainTicket = 210;
    int FlightTicket = 400;
    void booking(int ticketNo,String name);
    
}

class Bus implements Booking {
     private boolean[] tickets = new boolean[busTicket];

    @Override
    public void booking(int tno,String cname) {
        // TODO Auto-generated method stub
        int index = tno-1;
        if(!tickets[index]) {
            tickets[index]=true;
            System.out.println("Bus Ticket #" + index + " booked for " + cname);
        }
        else {
            System.out.println("Bus Ticket #" + index + " already booked");
        }
        
    }
    
}
class Train implements Booking {
     private boolean[] tickets = new boolean[TrainTicket];

    @Override
    public void booking(int tno,String cname) {
        // TODO Auto-generated method stub
        int index = tno-1;
        if(!tickets[index]) {
            tickets[index]=true;
            System.out.println("Train Ticket #" + index + " booked for " + cname);
        }
        else {
            System.out.println("Train Ticket #" + index + " already booked");
        }
        
    }
    
}
class Flight implements Booking {
     private boolean[] tickets = new boolean[FlightTicket];

    @Override
    public void booking(int tno,String cname) {
        // TODO Auto-generated method stub
        int index = tno-1;
        if(!tickets[index]) {
            tickets[index]=true;
            System.out.println("Flight Ticket #" + index + " booked for " + cname);
        }
        else {
            System.out.println("flight Ticket #" + index + " already booked");
        }
        
    }
    
}