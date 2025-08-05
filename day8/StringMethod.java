/*Develop a Java program to illustrate the usage of toString() method. */

package day8;

public class StringMethod {
    public static void main(String[] args) {
        Student std = new Student("Kaniga",123,9345649583l);
        System.out.println("Implicity call ");
        System.out.println(std);
        System.out.println("Explicity call ");
        System.out.println(std.toString());
    }
    
}

class Student {
    String name;
    int id;
    long phno;

    Student(String name,int id,long phno) {
        this.name = name;
        this.id = id;
        this.phno = phno;
    }
    public String toString() {
        return "Name "+name+" Rollno "+id+" Phone no "+phno;
    }
}
