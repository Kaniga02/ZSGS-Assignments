//Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.
package Part2;
import java.util.*;
public class SumofOddNumbers
{
    public static void main(String[] args)
    {
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements : ");

        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();

        oddNumbersSum(arr);
    }
    public static void oddNumbersSum(int[] arr)
    {
        int sum =0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]%2!=0)
                sum+=arr[i];

        System.out.println("Sum of odd numbers : "+sum);

    }
}
