

import java.util.*;

public class PrintR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the odd numbers to print R ");
        int n=sc.nextInt();

        

        int mid = n/2;
        for(int i=0;i<n;i++)
        {
            System.out.println();
            for(int j=0;j<n;j++)
            {
                if((i==j && i>mid) || i==0 || j==0 || (i<=mid && j==n-1) || i==mid)
                    System.out.print("R ");
                else 
                    System.out.print("  ");

               
            }
           
        }

        sc.close();
    }
    
}
