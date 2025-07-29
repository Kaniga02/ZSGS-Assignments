package Day3;

public class Vehicle {
    int vehiNo;
    String brandName;
    double price;

    static int vehicleCount = 0;

    Vehicle(int vehiNo,String brandName,double price)
    {
        this.vehiNo = vehiNo;
        this.brandName = brandName;
        this.price=price;
        vehicleCount++;
    }
    public void displayDetails()
    {
        System.out.println("Vehicle ID   : " + vehiNo);
        System.out.println("Brand Name   : " + brandName);
        System.out.println("Price        : " + price);
        System.out.println();
    }

    
    public static void totalNumberCount()
    {
        System.out.println("Total no of Vehicles : "+vehicleCount);
    }
    public static void main(String[] args)
    {
        Vehicle vc1 = new Vehicle(101, "Honda", 900000);
        Vehicle vc2 = new Vehicle(103, "TATA", 8500000);
        Vehicle vc3 = new Vehicle(102, "Suzuki", 1000000);

        vc1.displayDetails();
        vc2.displayDetails();
        vc3.displayDetails();
        
        Vehicle.totalNumberCount();
    }
    
}
