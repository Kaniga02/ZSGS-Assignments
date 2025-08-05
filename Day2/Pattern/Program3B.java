package Pattern;


import java.util.*;

public class Program3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row : ");
        int n = sc.nextInt();

        int i = 1;
        int mid = (n/2)+1;
        
        while (i <= mid) {
            int j = 1;
            while (j <= i) {
                System.out.print("W ");
                j++;
            }
            System.out.println();
            i++;
        }
        i = mid - 1;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("W ");
                j++;
            }
            System.out.println();
            i--;
        }


        sc.close();
    }
    
}
