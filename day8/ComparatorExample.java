/*Develop a Java program which illustrates the usage of Comparator Interface. */
package day8;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Ram", 22));
        list.add(new Student(105, "Anu", 19));
        list.add(new Student(103, "Bala", 21));

        System.out.println("\n------- Before Sorting ---------");
        for (Student s : list)
            System.out.println(s);

        // Sort by name
        Collections.sort(list, new SortByName());
        System.out.println("\n---------- After Sorting by Name ----------");
        for (Student s : list)
            System.out.println(s);

        // Sort by age
        Collections.sort(list, new SortByAge());
        System.out.println("\n--------- After Sorting by Age ---------------");
        for (Student s : list)
            System.out.println(s);
    }
}

class Student {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return rollNo + " - " + name + " - " + age;
    }
}


class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name); 
    }
}

class SortByAge implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.age - b.age; 
    }
}