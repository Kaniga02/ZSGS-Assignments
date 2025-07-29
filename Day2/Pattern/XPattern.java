import java.util.*;

public class XPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the X pattern : ");
        int n= sc.nextInt();

        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<n;j++)
                if (i == j || i + j == n - 1) {
                    System.out.print("1");
                } else {
                    System.out.print(" ");
                }
            System.out.println();

        }
        sc.close();
    }
    
}
