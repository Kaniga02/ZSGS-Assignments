//Write a program to check whether the given two numbers are equal or not w/o using comparison operator?
public class ComparisonOperator
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 20;
        int ans = num1^num2; // using this xor two numbers are equal return zero
        switch(ans)
        {
            case 0:
                System.out.println("True");
                break;
            default:
                System.out.println("false");
        }
    }
}