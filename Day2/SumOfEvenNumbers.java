package Day2;

public class SumOfEvenNumbers {

    public static void main(String[] args)
    {
        int n =5;
        int sum =0;

        for(int i=1;i<=n*2;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            System.out.println(sum);
            }
        }
        System.out.println("Sum of the Even Number is "+sum);
    }
    
}
