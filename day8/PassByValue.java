/* Develop a Java program to illustrate pass-by-value. */

package day8;

public class PassByValue {
    
   public static void main(String[] args) {
        int x = 5;
        System.out.println("Before method call: x = " + x);
          changeValue(x);
        System.out.println("After method call: x = " + x);

        Employee emp = new Employee("Kaniga");
        System.out.println("\nBefore method call: emp.name = " + emp.name);
        modifyObject(emp);
        System.out.println("After method call: emp.name = " + emp.name);

        resetObject(emp);
        System.out.println("After resetObject call: emp.name = " + emp.name);
    }
    static void modifyObject(Employee e) {
        e.name = "Sakthivel"; 
        System.out.println("Inside method: emp.name = " + e.name);
    }

    static void changeValue(int num) {
        num = 100;
        System.out.println("Inside method: num = " + num);
    }
    static void resetObject(Employee e) {
        e = new Employee("NewName");  
        System.out.println("Inside method (new object): emp.name = " + e.name);
    }
}
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}
 
