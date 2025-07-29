package Day2;
public class MinimumOfThreeNumbers {
    public static void main(String[] args)
    {
        int num1 = 30;
        int num2 = 35;
        int num3 = 20;

        if( num1<=num2 && num1<=num3)
            System.out.println("Minimum number is : "+num1);
        else if(num2<=num3 && num2<=num1)
                System.out.println("Minimum number is : "+num2);
            else 
                System.out.println("Minimum number is : "+num3);
        
    }
    
}
