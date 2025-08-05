

public class GradeOfTheStudent {
    public static void main(String[] args)
    {
        GradeOfTheStudent g= new GradeOfTheStudent();
        printGrade(85);
    }
    public static void printGrade(int percent)
    {
        if(percent>=85 && percent<=100)
            System.out.println("Grade : A");
        else if(percent>=70 && percent<=84)
                System.out.println("Grade : B");
        else if(percent>=50 && percent<70)
                System.out.println("Grade : C");
            else 
                System.out.println("Fail..");
        
    }
}
