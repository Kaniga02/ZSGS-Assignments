//Write a program to check whether the object is an instance of a particular class?
public class CheckInstanceObject {
    String name = "Zoho Coroporation";
    static int id = 21209;
    public void printid()
    {
        System.out.println("Employee ID : "+id);
        System.out.println("Name : "+ name);
    }

    public static void main(String[] args)
    {
        CheckInstanceObject ob = new CheckInstanceObject();
        if(ob instanceof CheckInstanceObject)
        {
             System.out.println("true");
            ob.printid();
        }
        else
            System.out.println("false");
           
    }
    
}
