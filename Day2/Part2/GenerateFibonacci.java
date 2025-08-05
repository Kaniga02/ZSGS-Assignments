// Write a program which generates 30 terms of Fibonacci no in an array and then prints it.

package Part2;

public class GenerateFibonacci {
    public static void main(String[] args)
    {
        int num = 30;
        fib(num);
    }
    public static void fib(int n)
    {
        int prev =0;
        int f =1;
        
        for(int i=0;i<=n;i++)
        {
            int num = prev +f;
            System.out.println(num);
            f = prev;
            prev = num;
            
        }
    }
    
}
