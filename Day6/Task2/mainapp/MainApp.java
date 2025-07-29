package Task2.mainapp;

import java.util.Scanner;

import Task2.arithmetic.ArithmeticOperations;
import Task2.stringutils.StringOperations;

public class MainApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArithmeticOperations arith = new ArithmeticOperations();
        StringOperations sOperation  = new StringOperations();

        
        System.out.println("\n1. Arithmetic Operations : ");
        System.out.println("2. String Operations : ");
        System.out.println("Enter your Choice : ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:
                System.out.println("Enter the first integer value : ");
                int a = sc.nextInt();
                System.out.println("Enter the second integer value : ");
                int b = sc.nextInt();
                System.out.println("\nArithmetic Operations : ");
                System.out.println("------------------------");
                System.out.println("Addition       : "+a+" + "+b+" = "+arith.add(a,b));
                System.out.println("Subtraction    : "+a+" - "+b+" = "+arith.subtract(a,b));
                System.out.println("Multiplication : "+a+" * "+b+" = "+arith.multiply(a,b));
                System.out.println("Division       : "+a+" / "+b+" = "+arith.divide(a,b));
                System.out.println("Modulus        : "+a+" % "+b+" = "+arith.modulus(a, b));
                break;
            case 2:
                System.out.println("Enter the First String : ");
                String str1 = sc.nextLine();

                System.out.println("enter the second String : ");
                String str2 = sc.nextLine();
                System.out.println("\nString Operations : ");
                System.out.println("-------------------");
                System.out.println("Length        : "+str1+" - "+sOperation.length(str1));
                System.out.println("Concatenation : "+str1+ " + "+str2+" = "+sOperation.concat(str1, str2));
                System.out.println("Reversing     : "+str2+" - "+sOperation.reverseString(str2));
        }//switch

       
        sc.close();
    }

    
}
