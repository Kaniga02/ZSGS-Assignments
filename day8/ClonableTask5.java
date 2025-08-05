/*Write a program to illustrate the usage of clone() and find out what kind of copy it will make. */

package day8;

public class ClonableTask5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee(101, "Kaniga");
        Employee emp2 = (Employee) emp1.clone();

        System.out.println("Before change:");
        emp1.display();
        emp2.display();

        emp1.name = "SakthiVel";

        System.out.println("\nAfter modifying emp1:");
        emp1.display();
        emp2.display();
    }
}

class Employee implements Cloneable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
