/*Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Type of Employeee 1. FullTime 2. PartTime : ");
        int type = sc.nextInt();
        sc.nextLine();
        Employee emp = null;
        if(type==1) {
            emp= new FullTimeEmployee();
        }
        else {
            emp= new PartTimeEmployee();
        }
        emp.inputDetails(sc);
        System.out.println("\nEmployee Details ");
        System.out.println("-----------------");
        
        System.out.println("Monthly Salary : Rs."+emp.calculateSalary());
        
    }
}

class Employee { 
    int empId;
    String name;

    public void inputDetails(Scanner sc)
    {
        System.out.println("Enter the Employee Name : ");
        name = sc.nextLine();
        System.out.println("Enter the Employee Id : ");
        empId = sc.nextInt();

    }

    public void displayDetails()
    {
        System.out.println("Id   : "+empId);
        System.out.println("Name : "+name);
    }

    public double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    public void inputDetails(Scanner sc) {
        super.inputDetails(sc);
        System.out.println("Enter the Monthly Salary : ");
        monthlySalary = sc.nextDouble();
    }
    @override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourSalary;
    double partTimeSalary;
    double workHour;
    public void inputDetails(Scanner sc) {
        super.inputDetails(sc);
        System.out.println("Enter the amount for Per hour : ");
        hourSalary = sc.nextDouble();
        System.out.println("Enter the total hour work : ");
         workHour = sc.nextDouble();
    }

    @override
    public double calculateSalary()
    {
        partTimeSalary = workHour * hourSalary;
        return partTimeSalary;
    }


}
