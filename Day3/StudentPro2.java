/* Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively. */
package Day3;

public class StudentPro2 {
    String name;
    int rollNo;
    long phoneNo;
    String address;

    
    StudentPro2(String sname,int srollNo,long sphoneno,String add)
    {
        name = sname;
        rollNo = srollNo;
        phoneNo = sphoneno;
        address = add;

    }

    public void display()
    {
        System.out.println("Student Details : ");
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollNo);
        System.out.println("Phone No : "+phoneNo);
        System.out.println("Address : "+address);

    }
    public static void main(String[] args)
    {
        StudentPro2 std1 =new StudentPro2("John",201,9876546787l,"south street,surandai");
        StudentPro2 std2 =new StudentPro2("Sam",203,9870006787l,"north street,surandai");
        std1.display();
        std2.display();

        
        
    }
}
