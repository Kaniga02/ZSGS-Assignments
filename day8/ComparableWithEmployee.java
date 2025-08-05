/*Develop a Java program which illustrates the usage of Comparable Interface. */

package day8;
import java.util.*;

public class ComparableWithEmployee {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(103, "Ram", 50000));
        list.add(new Employee(101, "Anu", 45000));
        list.add(new Employee(102, "Bala", 48000));

        System.out.println("\n\t------------- Before Sorting-------------");
        for (Employee emp : list)
            System.out.println(emp);

        Collections.sort(list);

        System.out.println("\n\t\t----------After Sorting by Employee ID ------------");
        for (Employee emp : list)
            System.out.println(emp);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Employee other) {
        return this.id - other.id;
    }

    public String toString() {
        return id + " - " + name + " - Rs." + salary;
    }
}

