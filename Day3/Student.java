/*Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student. */
package Day3;

public class Student {
    String name;
    int rollNo;
    public static void main(String[] args)
    {
        Student std =new Student();
        std.name = "John";
        std.rollNo = 2;

        System.out.println("Name : "+std.name);
        System.out.println("Roll No : "+std.rollNo);
        
    }
    
}
