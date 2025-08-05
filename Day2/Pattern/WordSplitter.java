package Pattern;

import java.util.*;

public class WordSplitter {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        System.out.println("Enter the column :");
        int col = sc.nextInt();

        str = str.replaceAll(" ", "");
        for(int i=0;i<str.length();i+=col)
        {
            int end = Math.min(i + col, str.length());
            
                System.out.println(str.substring(i,end));
        }
        sc.close();
    }
    
}
