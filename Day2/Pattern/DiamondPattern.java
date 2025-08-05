package Pattern;

import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the rows ");
        int n = sc.nextInt();
        int i=1;
        int num = 1;

        while(i<=(n+1)/2)
        {
            int space = n-i;
            int s = 0;

            while(s<space)
            {
                System.out.print(" ");
                s++;
            }
            int j=1;

           while (j <= i) {
                System.out.print(num + " ");
                num++;
                j++;
            }

            System.out.println();
            i++;
            
        }//upper diamond

        //Lower Diamond
        i=((n)/2)+1;
        while(i>0)
        {
            int space = n-i+1;
            int s = 0;

            while(s<space)
            {
                System.out.print(" ");
                s++;
            }
            int j=1;

           while (j < i) {
                System.out.print(
                    
                num + " ");
                num++;
                j++;
            }

            System.out.println();
            i--;
            
        }

        sc.close();
    }
    
}
