/*Create a Java application to manage employees in a company. Define an Interface Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.
‌ */

package day7.employee_Using_Abstract;

public class Employees {
    public static void main(String[] args) {

        Employee full = new FullTimeEmployee("kaniga",123,45000);
        full.displayDetails();
        System.out.println("Monthly salary "+full.calculateSalary());
        Employee part = new PartTimeEmployee("Raji",456,6,5000);
        part.displayDetails();
        System.out.println("Monthly salary "+part.calculateSalary());
    }
    
}

interface Employee {
    double calculateSalary();
    void displayDetails();
}

class FullTimeEmployee implements Employee {
    String name;
    int id;
    double monthlySalary;

    FullTimeEmployee(String name,int id,double monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayDetails(){
        System.out.println("\n--------------Employee Details - Part Time-------------");
        System.out.println("Name   : "+name);
        System.out.println("Id     : "+id);
        System.out.println("salary : "+monthlySalary);
    }
}

class PartTimeEmployee implements Employee {
    String name;
    int id;
    double amtPerHour;
    int hour;
    double salary;

    PartTimeEmployee(String name,int id,int hour,double amtPerHour) {
        this.name = name;
        this.id = id;
        this.amtPerHour = amtPerHour;
        this.hour = hour;
    }

    @Override
    public double calculateSalary() {
        salary = hour * amtPerHour;
        return salary;
    }

    @Override
    public void displayDetails(){
        System.out.println("\n--------------Employee Details --------------------");
        System.out.println("Name   : "+name);
        System.out.println("Id     : "+id);
        System.out.println("Total Hour Work : "+hour);
        System.out.println("Amount per hour : "+amtPerHour);
        System.out.println("salary : "+salary);
    }
}