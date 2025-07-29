package Task2.arithmetic;

public class ArithmeticOperations {
    public int add(int a,int b)
    {
        return a+b;
    }//add

    public int subtract(int a,int b)
    {
        return a-b;
    }//subtract
    public int multiply(int a,int b)
    {
        return a*b;
    }//multiply
    public double divide(int a,int b)
    {
        if(b==0)
            throw new ArithmeticException("Divide by zero Errors"); 
        return (double) a/b;
    }//divide

    public double modulus(int a,int b)
    {
        if(b==0)
            throw new ArithmeticException("Divide by zero Errors"); 
        return (double) a%b;
    }
    
}
