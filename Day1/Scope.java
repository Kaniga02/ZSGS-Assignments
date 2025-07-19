// Write code to illustrate the various scope of variables(static,local,instance,block,final variables)
import java.util.*;
public class Scope
{
    public static void main(String[] args){
        Student s=new Student();
        s.display();

    }
}
class Student{
    String studentName = "Kaniga";
    final String collegeName = "V.V.V College";
    final static int regNo = 212019017;
    void display()
    {
        int age = 21;
        System.out.println("Local variable (age): " + age);

        if (age >= 18) {
            String eligibility = "Eligible for college";
            System.out.println("Block variable (eligibility): " + eligibility);
        }
    }

}