package Day3;

public class Employee {
    public static void main(String[] args)
    {
        Employees emp1=new Employees();
        Employees emp2=new Employees("John",101,"Developer",55000.00);
        Employees emp3=new Employees(emp2);
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();


    }
    
}
class Employees
{
    String empName;
    int empId;
    String designation;
    double salary;
    Employees()
    {
        System.out.println("No arguments constructor call");
        empName = "xxxxx";
        empId = 0;
        designation = "YYYYY";
        salary = 0.0;
    }
    Employees(String name, int employeeID, String designation, double salary) {
        this.empName = name;
        this.empId = employeeID;
        this.designation = designation;
        this.salary = salary;
    }
    Employees(Employees emp) {
        this.empName = emp.empName;
        this.empId = emp.empId;
        this.designation = emp.designation;
        this.salary = emp.salary;
    }

    public void displayDetails()
    {
        System.out.println(" Employee Details: ");
        System.out.println("Name        : " + empName);
        System.out.println("Employee ID : " + empId);
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : " + salary);
        System.out.println();
    }

}
