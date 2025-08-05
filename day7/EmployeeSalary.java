/*Create a Java application to manage employees in a company. Define an abstract class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference. */

package day7;

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee full = new FullTimeEmployee("kaniga",123,45000);
        full.displayDetails();
        System.out.println("Monthly salary "+full.calculateSalary());
        Employee part = new PartTimeEmployee("Raji",456,6,5000);
        part.displayDetails();
        System.out.println("Monthly salary "+part.calculateSalary());

    }
} 

abstract class Employee {
    String name;
    int id;

    Employee(String name,int id) {
        this.name = name;
        this.id = id;
    }
    public abstract double calculateSalary();
    public void displayDetails() {
        System.out.println("Employee name : "+name);
        System.out.println("Employee ID : "+id);
    }
}//abstract class

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name,int id,double monthlySalary) {
        super(name,id);
        this.monthlySalary = monthlySalary;
    }
    

    @Override
    public double calculateSalary() {
        // TODO Auto-generated method stub
        return monthlySalary;
        
    }

}

class PartTimeEmployee extends Employee {
    double amtPerHour;
    int hour;

    PartTimeEmployee(String name,int id,int hour,double amtPerHour) {
        super(name,id);
        this.amtPerHour = amtPerHour;
        this.hour = hour;
    }
    

    @Override
    public double calculateSalary() {
        // TODO Auto-generated method stub
        return hour * amtPerHour;
        
    }

}
