package Day3;

public class EmployeePro6 {
    
    public static void main(String[] args)
    {
         EmployeeTemp e1 = new EmployeeTemp("Robert", 1994, "64C", "Chennai");
        EmployeeTemp e2 = new EmployeeTemp("Sam", 2000, "68D", "Mumbai");
        EmployeeTemp e3 = new EmployeeTemp("John", 1999, "26B", "Tenkasi");
        System.out.format("%-10s %-17s %-8s %-15s\n", "Name", "Year of joining", "Salary", "Address");

        // Print employee details
        System.out.format("%-10s %-17d %-8s %-15s\n", e1.name, e1.yearOfJoining, e1.salary, e1.address);
        System.out.format("%-10s %-17d %-8s %-15s\n", e2.name, e2.yearOfJoining, e2.salary, e2.address);
        System.out.format("%-10s %-17d %-8s %-15s\n", e3.name, e3.yearOfJoining, e3.salary, e3.address);
    }
    
}

 class EmployeeTemp {
    String name;
    int yearOfJoining;
    String salary;
    String address;

   
    public EmployeeTemp(String name, int yearOfJoining, String salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }
}

