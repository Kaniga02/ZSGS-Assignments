//Write a program to take in 10 values and print only those numbers which are prime.
package Day2.Part2;

public class FindPrimeNumbers {
    public static void main(String[] args)
    {
        int[] num = {23,1,4,78,60,55,67,43,20,76} ;
        primes(num);
    }
    public static void primes(int[] n)
    {
        int flag = 0;
        for(int i=0;i<n.length;i++)
        {
            flag=0;
            for(int j=2;j<n[i]/2;j++)
            {
                if(n[i]%j==0)
                {
                    flag=1;
                    break;
                }

            }
            if(flag==0)
                System.out.println(n[i]);
        }
    }

    
}
