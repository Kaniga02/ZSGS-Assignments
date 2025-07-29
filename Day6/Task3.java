/*Design a class`Employee with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee. */



import java.util.*;

public class Task3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employee Number : ");
        int empid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Employee Name : ");
        String empName = sc.nextLine();
        System.out.println("Enter the Employee Department : ");
        String empdepartment = sc.nextLine();
        System.out.println("Enter the Employee designation : ");
        String empdesign = sc.nextLine();
        System.out.println("Enter the Employee Salary : ");
        double empsalary = sc.nextDouble();

        Employee emp = new Employee();

        emp.setId(empid);
        emp.setName(empName);
        emp.setDepartment(empdepartment);
        emp.setDesignation(empdesign);
        emp.setSalary(empsalary);
        emp.setAnnualSalary(empsalary);
        emp.displayDetails();
        sc.close();
    } 
}
class Employee
{
    private int employeeId;
    private String employeeName;
    private String department;
    private String designation;
    private double salary;
    private double annualSalary;
    
    public void setId(int empid){
        employeeId = empid;
    }
    
    public void setName(String empName){
        employeeName =empName;
    }
    public void setDepartment(String empdepartment) {
        department =  empdepartment;
    }
    public void setDesignation(String empdesign){
            designation = empdesign;
        }
    public void setSalary(double empsalary){
        salary = empsalary;
    }
    public void setAnnualSalary(double empsalary){
        annualSalary = empsalary*12;
    }

    //getter methods
    public int getId(){
        return employeeId;
    }
    public String getName(){
        return employeeName;
    }
    public String getdepartment(){
        return department;
    }
    public String getDesignation(){
        return designation;
    }
    public double getSalary(){
        return salary;
    }
    public double getAnnualSalary(){
        return annualSalary;
    }

    //Details

    public void displayDetails(){
        System.out.println(" Employee Details: ");
        System.out.println("Name        : " + getName());
        System.out.println("Employee ID : " +  getId());
        System.out.println("Designation : " + getDesignation());
        System.out.println("Department  : "+getdepartment());
        System.out.println("Salary      : " + getSalary());
        System.out.println("Annual Salary  : " + getAnnualSalary());
    }



}