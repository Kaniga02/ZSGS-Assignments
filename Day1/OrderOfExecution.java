//Write a program that illustrate the execution order of static block and initializer block?
public class OrderOfExecution
{
    public static void main(String[] args)
    {
         System.out.println("Main Block");
        OrderOfExecution ob = new     OrderOfExecution();
    }
    static
    {
        System.out.println("Static block");
    }
    OrderOfExecution()
    {
        System.out.println("Constructor Block");
    }
    {
        System.out.println("Instance Block");
    }
}