/* We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike. */
package Day4;

//create a main class 
public class Vehicles{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Cars Details : Audi");
        System.out.println("-------------------");

        //creating object for the ausi class
        Audi audi = new Audi();
        audi.modelType = "A6";
        audi.ownershipCost = 150000;
        audi.warranty = 4;
        audi.seatCapacity = 5;
        audi.fuelType = "Petrol";
        audi.mileage = 15.5;
        audi.price = 5000000;
        audi.display();

        System.out.println();
        System.out.println("Cars Details : Ford");
        System.out.println("-------------------");
        // object creation for ford
        Ford ford = new Ford();
        ford.modelType = "Endeavour";
        ford.ownershipCost = 120000;
        ford.warranty = 3;
        ford.seatCapacity = 7;
        ford.fuelType = "Diesel";
        ford.mileage = 12.3;
        ford.price = 3500000;
        ford.display();

        System.out.println();
        System.out.println("Bikes Details : Bajaj");
        System.out.println("---------------------");

        System.out.println();
        //object cretion for the Bajaj Class
        Bajaj bajaj = new Bajaj();
        bajaj.makeType = "Pulsar";
        bajaj.cylinders = 1;
        bajaj.gears = 5;
        bajaj.coolingType = "Air";
        bajaj.wheelType = "Alloys";
        bajaj.fuelTankSize = 15;
        bajaj.mileage = 45;
        bajaj.price = 120000;
        bajaj.display();

        System.out.println();
         System.out.println("Bikes Details : Bajaj");
        System.out.println("---------------------");
        //Object creation for the tvs class
        TVS tvs = new TVS();
        tvs.makeType = "Apache";
        tvs.cylinders = 1;
        tvs.gears = 5;
        tvs.coolingType = "Oil";
        tvs.wheelType = "Spokes";
        tvs.fuelTankSize = 12;
        tvs.mileage = 50;
        tvs.price = 110000;
        tvs.display();
    } 
}


class Vehicle {
    double mileage;
    double price;

}
//create a class for car

class Car extends Vehicle{
    String fuelType;
    int seatCapacity;
    double ownershipCost;
    int warranty;
}

class Audi extends Car{
    String modelType;

    void display(){
        System.out.println("Audi Model        : "+modelType);
        System.out.println("Warranty          : "+warranty);
        System.out.println("Price             : "+price);
        System.out.println("Seating Capacity  : " +seatCapacity);
        System.out.println("Ownership cost    : "+ownershipCost);
        System.out.println("Mileage           : "+mileage);
        System.out.println("Fuel Type         : "+fuelType);
    }

}

class Ford extends Car{
    String modelType;

    void display(){
        System.out.println("Audi Model        : "+modelType);
        System.out.println("Warranty          : "+warranty);
        System.out.println("Price             : "+price);
        System.out.println("Seating Capacity  : " +seatCapacity);
        System.out.println("Ownership cost    : "+ownershipCost);
        System.out.println("Mileage           : "+mileage);
        System.out.println("Fuel Type         : "+fuelType);
    }

}//class - ford


class Bike extends Vehicle{
    int cylinders;
    int gears;
    String coolingType;
    String wheelType;
    double fuelTankSize;

}//class - Bike

class Bajaj extends Bike{
    String makeType;
    

    void display(){
        System.out.println("Make Type      : "+makeType);
        System.out.println("Price          : "+price);
        System.out.println("Mileage        : "+mileage);
        System.out.println("Cylinders      : "+cylinders);
        System.out.println("Gears          : "+gears);
        System.out.println("Wheel Type     : "+wheelType);
        System.out.println("Fuel Tank Size : "+fuelTankSize+" inches");
        System.out.println("Cooling Type   : "+coolingType);

    }
}//class - Bajaj

class TVS extends Bike{
    String makeType;
    

    void display(){
        System.out.println("Make Type      : "+makeType);
        System.out.println("Price          : "+price);
        System.out.println("Mileage        : "+mileage);
        System.out.println("Cylinders      : "+cylinders);
        System.out.println("Gears          : "+gears);
        System.out.println("Wheel Type     : "+wheelType);
        System.out.println("Fuel Tank Size : "+fuelTankSize+" inches");
        System.out.println("Cooling Type   : "+coolingType);

    }
}//class -ford

