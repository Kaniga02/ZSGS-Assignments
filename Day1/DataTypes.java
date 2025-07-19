//Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.
public class DataTypes
{
    public static void main(String[] args){

    int totalMarks = 456;
    double avg = totalMarks/5;
    long phoneNumber = 9345649583l;
    String studentName = "Kaniga";
    float avgf = totalMarks/5f;
    boolean result = totalMarks > 250;
    char grade = result == true?'A':'F';
    byte rollNo = 17;
    short regNo = 2117;
    System.out.println("Student Name : "+studentName);
    System.out.println("Total Marks  : " + totalMarks);
        System.out.println("Average (double) : " + avg);
        System.out.println("Average (float)  : " + avgf);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Register No  : " + regNo);
        System.out.println("Passed?      : " + result);
        System.out.println("Grade        : " + grade);
    }


}