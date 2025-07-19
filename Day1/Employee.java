//Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee(int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them?
public class Employee {
    public static void main(String[] args)
    {
        int empId = 21345;
        String name = "Kaniga";
        String department = "Developer";
        double salary = 45000.00;

        Emp em = new Emp(empId,name,department,salary);
        em.detailsPrint();

    }
    
}//class Employee

class Emp{
    String name;
    int empId;
    String department;
    double salary;
    Emp()
    {}

    Emp(int empId,String name,String department,double salary)
    {
        this.empId =empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public  void detailsPrint()
    {
        System.out.println("Employee Details : ");
        System.out.println("Name : "+ name);
        System.out.println("Id : "+empId);
        System.out.println("Department : "+department);
        System.out.println("Salary : "+salary);
    }

}
